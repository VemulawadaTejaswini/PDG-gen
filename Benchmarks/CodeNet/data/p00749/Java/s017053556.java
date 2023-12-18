import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static class UnionFind{
	    int[] par; // 
	    
	    public UnionFind(int n){
	        par = new int[n];
	        for(int i = 0; i < n; i++){ par[i] = -1; }
	    }
	    
	    public int find(int x){
	        if(par[x] < 0){
	            return x;
	        }else{
	            return par[x] = find(par[x]);
	        }
	    }
	    
	    public boolean union(int x, int y){
	        x = find(x);
	        y = find(y);
	        
	        if(x != y){
	            if(par[y] < par[x]) {  // 多い方が根になるようにスワップする.
	                int tmp = x; x = y; y = tmp;
	            }
	            par[x] += par[y];
	            par[y] = x;
	            return true;
	        }else{
	            return false;
	        }
	    }
	    
	    public boolean same(int x, int y){
	        return find(x) == find(y);
	    }
	    
	    public int size(int x){
	        return -par[find(x)];
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int w = sc.nextInt();
			final int h = sc.nextInt();

			if(w == 0 && h == 0){
				break;
			}
			
			int[][] blocks = new int[h][w];
			for (int i = 0; i < h; i++) {
				final char[] inputs = sc.next().toCharArray();

				for (int j = 0; j < w; j++) {
					blocks[h - i - 1][j] = inputs[j] == '.' ? -1 : Character.getNumericValue(inputs[j]);
				}
			}
			
			UnionFind uf = new UnionFind(w * h);
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(blocks[i][j] < 0){ continue; }
					
					if(i != h - 1 && blocks[i][j] == blocks[i + 1][j]){
						uf.union(i * w + j, (i + 1) * w + j);
					}
					if(j != w - 1 && blocks[i][j] == blocks[i][j + 1]){
						uf.union(i * w + j, i * w + (j + 1));
					}
				}
			}
			
			HashMap<Integer, Integer> uf_to_id = new HashMap<Integer, Integer>();
			{
				int cnt = 0;
				for(int i = 0; i < h; i++){
					for(int j = 0; j < w; j++){
						if(blocks[i][j] < 0){ continue; }
						
						final int uf_id = uf.find(i * w + j);
						if(!uf_to_id.containsKey(uf_id)){
							uf_to_id.put(uf_id, cnt++);
						}
					}
				}
			}
			//System.out.println(uf_to_id);
			
			HashMap<Integer, Integer> id_to_min_x = new HashMap<Integer, Integer>();
			HashMap<Integer, Integer> id_to_max_x = new HashMap<Integer, Integer>();
			HashMap<Integer, Integer> id_to_dists = new HashMap<Integer, Integer>();
			HashMap<Integer, Integer> id_to_areas = new HashMap<Integer, Integer>();
			HashMap<Integer, HashSet<Integer>> nexts_ids = new HashMap<Integer, HashSet<Integer>>();
			HashMap<Integer, HashSet<Integer>> backs_ids = new HashMap<Integer, HashSet<Integer>>();
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(blocks[i][j] < 0){ continue; }
					
					final int uf_id = uf_to_id.get(uf.find(i * w + j));
					id_to_dists.put(uf_id, (id_to_dists.containsKey(uf_id) ? id_to_dists.get(uf_id) : 0) + 2 * j + 1);
					id_to_areas.put(uf_id, (id_to_areas.containsKey(uf_id) ? id_to_areas.get(uf_id) : 0) + 1);
					
					if(i == 0){
						id_to_min_x.put(uf_id, id_to_min_x.containsKey(uf_id) ? Math.min(id_to_min_x.get(uf_id), j) : j);
						id_to_max_x.put(uf_id, id_to_max_x.containsKey(uf_id) ? Math.max(id_to_max_x.get(uf_id), j + 1) : j + 1);
					}
					
					
					if(i < h - 1 && blocks[i][j] != blocks[i + 1][j] && blocks[i + 1][j] >= 0){
						final int up_uf_id = uf_to_id.get(uf.find(((i + 1) * w) + j));
						
						if(!nexts_ids.containsKey(uf_id)){
							nexts_ids.put(uf_id, new HashSet<Integer>());
						}
						nexts_ids.get(uf_id).add(up_uf_id);
						
						if(!backs_ids.containsKey(up_uf_id)){
							backs_ids.put(up_uf_id, new HashSet<Integer>());
						}
						backs_ids.get(up_uf_id).add(uf_id);
						
						id_to_min_x.put(up_uf_id, id_to_min_x.containsKey(up_uf_id) ? Math.min(id_to_min_x.get(up_uf_id), j) : j);
						id_to_max_x.put(up_uf_id, id_to_max_x.containsKey(up_uf_id) ? Math.max(id_to_max_x.get(up_uf_id), j + 1) : j + 1);
					}
				}
			}
			
			//System.out.println(nexts_ids + " " + backs_ids + " " + id_to_min_x + " " + id_to_max_x);
			//System.out.println(nexts_ids);
			//System.out.println(backs_ids);
			LinkedList<Integer> id_stack = new LinkedList<Integer>();
			HashSet<Integer> visited = new HashSet<Integer>();
			id_stack.addFirst(0);
			
			boolean safe = true;
			while(!id_stack.isEmpty()){
				final int id = id_stack.getFirst();
				
				boolean ok = true;
				if(nexts_ids.containsKey(id)){
					for(final int next : nexts_ids.get(id)){
						if(!visited.contains(next)){
							id_stack.addFirst(next);
							ok = false;
						}
					}
				}
				if(!ok){ continue; }
				
				id_stack.removeFirst();
				
				final int min_x = id_to_min_x.get(id);
				final int max_x = id_to_max_x.get(id);
				final int dist = id_to_dists.get(id);
				final int area = id_to_areas.get(id);
				final double G = dist / (area * 2.0);
				//System.out.println(id + " : " + min_x + " " + G + "(" + (dist / 2.0) + "/" + area + ")" + " " + max_x);
				if(G <= min_x || max_x <= G){
					safe = false;
					break;
				}
				
				visited.add(id);
				if(!backs_ids.containsKey(id)){ continue; }
				for(final int back : backs_ids.get(id)){
					id_to_dists.put(back, id_to_dists.get(back) + id_to_dists.get(id));
					id_to_areas.put(back, id_to_areas.get(back) + id_to_areas.get(id));
				}
			}
			
			System.out.println(safe ? "STABLE" : "UNSTABLE");
		}
	}
}