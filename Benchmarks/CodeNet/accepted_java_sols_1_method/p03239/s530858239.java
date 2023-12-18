import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int T=sc.nextInt();
		int[][] are=new int[N][2];
		for(int i=0; i<N; i++) {
			are[i][0]=sc.nextInt();
			are[i][1]=sc.nextInt();
		}
		int cost=1145141919;
		for(int i=0; i<N; i++) {
			if(T>=are[i][1]) {
				cost=Math.min(cost, are[i][0]);
			}
		}
		if(cost==1145141919) {
			System.out.println("TLE");
		}
		else {
			System.out.println(cost);
		}
	}
}