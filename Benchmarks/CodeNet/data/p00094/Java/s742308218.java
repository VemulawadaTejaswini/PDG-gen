import java.util.*;
public class Main {	
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new AOJ0094();
	}
	
	
	
	class  AOJ0155{
		int d[];
		int n;
		int x[];
		int y[];
		int ban[];
		int[][] cost;
		public AOJ0155(){
			Scanner in = new Scanner(System.in);
			while(true){
				n = in.nextInt();
				if(n==0)break;
				cost = new int[n+1][n+1];
				ban = new int[n+1];
				x = new int[n+1];
				y = new int[n+1];
				for(int i=1;i<n+1;i++){
					ban[i] = in.nextInt();
					x[i] = in.nextInt();
					y[i] = in.nextInt();
				}
				for(int i=1;i<n+1;i++){
					for(int s=i+1;s<n+1;s++){
						int x1 = x[i],y1= y[i],x2=x[s],y2=y[s];
						int costs = (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));		
						cost[i][s] = costs > 50 ? 1000000:costs;
						cost[s][i] = cost[i][s];
					}
				}
				for(int i=1;i<n+1;i++){
					for(int s=1;s<n+1;s++)System.out.print(cost[i][s]+" ");
					System.out.println();
				} //デバック
				int kai = in.nextInt();
				for(int i=0;i<kai;i++){
					int s = in.nextInt();
					int g = in.nextInt();
					//ArrayList<Integer> list = dijkstra(s, g);
				}
			}
		}
	}
			
	class AOJ0094{
		public AOJ0094() {
			Scanner in = new Scanner(System.in);
			int a=in.nextInt();
			int b=in.nextInt();
			double result = a*b;
			result/=3.305785;
			System.out.printf("%.6f",result);
		}
	}
	
	class AOJ0034{
		int[] kyori = new int[11];
		int speed1,speed2;
		public AOJ0034() {
			Scanner in = new Scanner(System.in);
			while(in.hasNext()){
				String input[] = in.next().split(",");
				int sum=0;
				for(int i=1;i<=10;i++){
					kyori[i] = Integer.parseInt(input[i-1]);
					sum+=kyori[i];
				}
				speed1 = Integer.parseInt(input[10]);
				speed2 = Integer.parseInt(input[11]);
//				double one,two;
//				for(int s=1;s<=10;s++){//終点駅まで
//					
//				}
				
				
				
			}
			
			
			
			
		}
		
		
	}
}