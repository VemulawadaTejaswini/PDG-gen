import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[][] w = new int[N][2];
		boolean beg = false;
		int cost =2000;
		//int res;
		//int time;
		for(int i = 0;i<N;i++) {
			w[i][0] = sc.nextInt();
			w[i][1] = sc.nextInt();
			if(w[i][1]<=T&&beg==false) {
				beg=true;
				//time = w[i][1];
				cost = w[i][0];
            //  System.out.println(cost);
			}

		}
		for(int n = 0;n<N;n++) {
			if(cost>w[n][0] && w[n][1]<=T) {
				cost = w[n][0];
			}
		}
		if(cost==2000) {
		System.out.println("TLE");
		}else {
			System.out.println(cost);
		}



	}

}
