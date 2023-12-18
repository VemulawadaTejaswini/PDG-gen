import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

class Main{

	
	public static void main(String[] args)throws NumberFormatException, IOException{
		InputStreamReader input = new InputStreamReader (System. in);
		BufferedReader buffer = new BufferedReader(input);
		String scan = buffer.readLine();
		long processStart = System.currentTimeMillis();
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		int nodeAmount  = Integer.parseInt(scan);
		int[] nodeLeft  = new int[nodeAmount];
		int[] nodeRight = new int[nodeAmount];		
		for(int i=0; i<nodeAmount; i++){
			scan = buffer.readLine();
			String[] str = scan.split(" ");
			nodeLeft[i] = Integer.parseInt(str[1]);
			nodeRight[i] = Integer.parseInt(str[2]);
		}
		
		int[] parent  = new int[nodeAmount];
		int[] sibling  = new int[nodeAmount];
		int[] degree  = new int[nodeAmount];
		int[] depth  = new int[nodeAmount];
		int[] height  = new int[nodeAmount];
		String[] rank = new String[nodeAmount];
		parent[0] = -1;
		sibling[0] = -1;
		rank[0] = "root";
		
		for(int i=0; i<nodeAmount; i++){		//parent??¨degree??????????????????
			int deg = 0;
			if(nodeLeft[i] > 0){
				parent[nodeLeft[i]]   = i;
				deg += 1;	
			}
			if(nodeRight[i] > 0){
				parent[nodeRight[i]]  = i;
				deg += 1;
			}
			degree[i] = deg;
		}
		
		for(int i=0; i<nodeAmount; i++){		//parent????????±??????sibling??????????????????
			for(int J=0; J<nodeAmount; J++){
				if(parent[i] == parent[J] && i!=J){
					sibling[J] = i;
				}
			}
		}
		
		stack.add(0);
		while(!stack.isEmpty()){		//depth??????????????????
			int check = stack.pollLast();
			if(nodeLeft[check] > 0){
				depth[nodeLeft[check]] = depth[check]+1;
				stack.add(nodeLeft[check]);
			}
			if(nodeRight[check] > 0){
				depth[nodeRight[check]] = depth[check]+1;
				stack.add(nodeRight[check]);
			}
		}
		
		stack.clear();
		for(int i=0; i<nodeAmount; i++){		//depth????????±??????height????±??????????
			if(degree[i] == 0){
				height[i] = 0;
			}
			else{
				int maxDepth = 0;
				stack.add(nodeLeft[i]);
				stack.add(nodeRight[i]);
				while(!stack.isEmpty()){
					int check = stack.pollLast();
					if(nodeLeft[check] > 0){
						stack.add(nodeLeft[check]);
					}
					if(nodeRight[check] > 0){
						stack.add(nodeRight[check]);
					}
					if(depth[check] > maxDepth){
						maxDepth = depth[check];
					}
				}
				height[i] = maxDepth - depth[i];
			}
		}
		
		for(int i=1; i<nodeAmount; i++){
			if(height[i] == 0){
				rank[i] = "leaf";
			}
			else{
				rank[i] = "internal node";
			}
		}
		
		
		
		
		
		for(int i=0; i<nodeAmount; i++){
			System.out.println("node "+i+": parent = "+parent[i]+", sibling = "+sibling[i]+", degree = "+degree[i]+", depth = "+depth[i]+", height = "+height[i]+", "+rank[i]);
		}
		
		long processEnd = System.currentTimeMillis();
//		System.out.println("???????????????" + (processEnd - processStart)  + "ms");
	}
}