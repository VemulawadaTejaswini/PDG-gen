import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int[] t = new int[n+1];
		int[] x = new int[n+1];
		int[] y = new int[n+1];

		t[0]=x[0]=y[0]=0;


		for(int i=0;i<n;i++) {
			t[i+1]=sc.nextInt();
			x[i+1]=sc.nextInt();
			y[i+1]=sc.nextInt();
		}

		boolean canReach=true;
		for(int i=0;i<n;i++) {

			//次の場所にいくのにかかる時間。
			int dt=t[i+1]-t[i];

			//次の場所への最短距離
			int distance=Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);

			//そもそもたどりつけない
			if(dt<distance) {canReach=false;};

			//ふらついてもぴったり止まれない
			if(distance%2 != dt % 2) {canReach=false;};

		}

		if(canReach) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();


	}


}
