import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int N = sc.nextInt();
		int[] h = new int[N];
		for(int i=0;i<h.length;i++){
			h[i] = sc.nextInt();
		}
		int[] cost = new int[N];
		int[] d1 = new int[N];
		int[] d2 = new int[N];

		cost[0] = 0;
		cost[1] = h[0] - h[1];
		if(cost[1]<0){
			cost[1] = cost[1]*(-1);
		}
		d1[0] = 0;
		d2[0] = 0;
		d2[1] = 0;


		int cost1 = 0;
		int cost2 = 0;


		for(int i=2;i<N;i++){
			d1[i] = h[i] - h[i-1];
			if(d1[i]<0){
				d1[i] = d1[i]*(-1);
			}
			d2[i] = h[i] - h[i-2];
			if(d2[i]<0){
				d2[i] = d2[i]*(-1);
			}

			cost1 = cost[i-1] + d1[i];
			cost2 = cost[i-2] + d2[i];
			if(cost1<cost2){
				cost[i] = cost1;
			} else {
				cost[i] = cost2;
			}
		}

		System.out.println(cost[N-1]);



	}

}
