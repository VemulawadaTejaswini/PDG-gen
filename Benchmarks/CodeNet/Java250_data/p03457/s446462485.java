import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] t = new int[N+1];
		int[] x = new int[N+1];
		int[] y = new int[N+1];

		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};

		int p = 0;
		int pt = 0;
		for(int i = 1;i < N+1;i++){
			t[i] = scanner.nextInt();
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();

		}

		for(int i = 1;i < N+1;i++){
			int distance = 0;
			int nextp = x[i]+y[i];				
			distance =  t[i] - pt -Math.abs(nextp - p)  ;			////次の地点までの距離
			if(distance < 0){
				System.out.println("No");
				return;
			}
			if(distance != 0){
				int judge = distance%2;
				if(judge == 1){
					System.out.println("No");
					return;
				}
			}
			p = nextp;
			pt = t[i];
		}

		System.out.println("Yes");





	}
}




class Graph{
	int from;
	int to;
	int cost;

	public Graph() {
	}

	public Graph(int f,int t,int c) {
		from = f;
		to= t;
		cost = c;
	}
}
