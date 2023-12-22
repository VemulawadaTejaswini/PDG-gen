import java.util.Scanner;

class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num[][];
		int N = sc.nextInt();
		int D = sc.nextInt();
		num = new int[N][D];
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < D;j++) {
				num[i][j] = sc.nextInt();
			}
		}
		int count = 0;
		for(int i = 0;i < N - 1;i++) {
			for(int j = i + 1;j < N;j++) {
				double distance = 0;
				for(int k = 0 ; k < D ;k++) {
					distance += (num[i][k] - num[j][k]) * (num[i][k] - num[j][k]);
				}
				distance = Math.sqrt(distance);
				if(distance == (double)((int)(distance))) count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}