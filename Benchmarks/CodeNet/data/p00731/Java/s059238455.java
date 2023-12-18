import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			sc.nextLine();
			String line;
			char[][] map = new char[w][h];
			NodeList[][] rightnodemap = new NodeList[w][h];
			NodeList[][] leftnodemap = new NodeList[w][h];
			int[][] leftMove = {{-2,-1},{-1,-1},{-1,-2},{-1,0},{-2,0},{-3,0},{-2,1},{-1,1},{-1,2}};
			int[][] rightMove = {{2,1},{1,1},{1,2},{1,0},{2,0},{3,0},{1,-1},{1,-2},{2,-1}};
			PriorityQueue<NodeList> queue = new PriorityQueue<NodeList>(w * h, new Comparator<NodeList>() {

				@Override
				public int compare(NodeList o1, NodeList o2) {
					return o1.count - o2.count;
				}
			});
			
			for(int i = 0; i < h; i++){
				line = sc.nextLine().replaceAll(" ", "");
				for(int j = 0; j < w; j++){
					map[j][i] = line.charAt(j);
					if(map[j][i] == 'S'){
						rightnodemap[j][i] = new NodeList(0, 0, 'r', j, i);
						queue.offer(rightnodemap[j][i]);
						leftnodemap[j][i] = new NodeList(0, 0, 'l', j, i);
						queue.offer(leftnodemap[j][i]);
					}else if(map[j][i] == 'T'){
						rightnodemap[j][i] = new NodeList(Integer.MAX_VALUE, 0, 'r', j, i);
						leftnodemap[j][i] = new NodeList(Integer.MAX_VALUE, 0, 'l', j, i);
						
					}else if(map[j][i] == 'X'){
						rightnodemap[j][i] = new NodeList(Integer.MAX_VALUE, -1, 'r', j, i);
						leftnodemap[j][i] = new NodeList(Integer.MAX_VALUE, -1, 'l', j, i);
					}else{
						rightnodemap[j][i] = new NodeList(Integer.MAX_VALUE, new Integer(line.charAt(j)) - 48, 'r', j, i);
						leftnodemap[j][i] = new NodeList(Integer.MAX_VALUE, new Integer(line.charAt(j)) - 48, 'l', j, i);
					}
				}
			}
			int size;
			int count;
			int x;
			int nextx;
			int y;
			int nexty;
			char nowfoot;
			while(true){
				size = queue.size();
				if(size == 0){
					break;
				}
				for(int i = 0; i < size; i++){
					count = queue.peek().count;
					nowfoot = queue.peek().nowfoot;
					x = queue.peek().x;
					y = queue.poll().y;
					if(nowfoot == 'r'){
						for(int j = 0; j < leftMove.length; j++){
							nextx = x + leftMove[j][0];
							nexty = y + leftMove[j][1];
							if(nextx >= 0 && nextx <= w - 1 && nexty >= 0 && nexty <= h-1 && leftnodemap[nextx][nexty].cost != -1
									&& count + leftnodemap[nextx][nexty].cost < leftnodemap[nextx][nexty].count){
								leftnodemap[nextx][nexty].changeCount(count + leftnodemap[nextx][nexty].cost);
								queue.offer(leftnodemap[nextx][nexty]);
							}
						}
					}else if(nowfoot == 'l'){
						for(int j = 0; j < rightMove.length; j++){
							nextx = x + rightMove[j][0];
							nexty = y + rightMove[j][1];
							if(nextx >= 0 && nextx <= w - 1 && nexty >= 0 && nexty <= h-1 && rightnodemap[nextx][nexty].cost != -1
									&& count + rightnodemap[nextx][nexty].cost < rightnodemap[nextx][nexty].count){
								rightnodemap[nextx][nexty].changeCount(count + rightnodemap[nextx][nexty].cost);
								queue.offer(rightnodemap[nextx][nexty]);
							}
						}
					}
				}
			}
			int sum = Integer.MAX_VALUE;
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(map[j][i] == 'T'){
						if(rightnodemap[j][i].count < sum){
							sum = rightnodemap[j][i].count;
						}
						if(leftnodemap[j][i].count < sum){
							sum = leftnodemap[j][i].count;
						}
					}
				}
			}
			if(sum == Integer.MAX_VALUE){
				System.out.println(-1);
			}else{
				System.out.println(sum);
			}

			
		}
		
	}
	

}

class NodeList{
	
	int x;
	int y;
	int cost;
	int count;
	char nowfoot;
	
	public NodeList(int count, int cost, char nowfoot,int x, int y){
		this.cost = cost;
		this.count = count;
		this.nowfoot = nowfoot;
		this.x = x;
		this.y = y;
	}
	
	
	public void changeCount(int count){
		this.count = count;
	}
	
	
}