import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int w,h;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			w=sc.nextInt();
			h=sc.nextInt();
			if(w==0&&h==0) break;
			int[][] map = new int[h][w];
			for(int j=0;j<h;++j){
				for(int i=0;i<w;++i){
					map[j][i]=sc.nextInt();
				}
			}
			int count=0;
			Queue<Node> queue = new LinkedList<Node>();
			for(int j=0;j<h;++j){
				for(int i=0;i<w;++i){
					if(map[j][i]==1){
						queue.add(new Node(j,i)); map[j][i]=0;
						while(!queue.isEmpty()){
							Node cur = queue.remove();
							if(cur.w!=0){
								if(map[cur.h][cur.w-1]==1){
									map[cur.h][cur.w-1]=0; queue.add(new Node(cur.h,cur.w-1));
								}
							}
							if(cur.h!=0){
								if(map[cur.h-1][cur.w]==1){
									map[cur.h-1][cur.w]=0; queue.add(new Node(cur.h-1,cur.w));
								}
							}
							if(cur.w!=w-1){
								if(map[cur.h][cur.w+1]==1){
									map[cur.h][cur.w+1]=0; queue.add(new Node(cur.h,cur.w+1));
								}
							}
							if(cur.h!=h-1){
								if(map[cur.h+1][cur.w]==1){
									map[cur.h+1][cur.w]=0; queue.add(new Node(cur.h+1,cur.w));
								}
							}
							if(cur.w!=0&&cur.h!=0){
								if(map[cur.h-1][cur.w-1]==1){
									map[cur.h-1][cur.w-1]=0; queue.add(new Node(cur.h-1,cur.w-1));
								}
							}
							if(cur.w!=0&&cur.h!=h-1){
								if(map[cur.h+1][cur.w-1]==1){
									map[cur.h+1][cur.w-1]=0; queue.add(new Node(cur.h-1,cur.w+1));
								}
							}
							if(cur.w!=w-1&&cur.h!=0){
								if(map[cur.h-1][cur.w+1]==1){
									map[cur.h-1][cur.w+1]=0; queue.add(new Node(cur.h+1,cur.w-1));
								}
							}
							if(cur.w!=w-1&&cur.h!=h-1){
								if(map[cur.h+1][cur.w+1]==1){
									map[cur.h+1][cur.w+1]=0; queue.add(new Node(cur.h+1,cur.w+1));
								}
							}
						}
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}

class Node{
	int h,w;
	Node(int w,int h){
		this.h=w;
		this.w=h;
	}
}

