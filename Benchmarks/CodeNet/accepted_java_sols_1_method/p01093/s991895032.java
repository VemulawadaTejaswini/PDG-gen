import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int d = 1000000;
		for(int n = sc.nextInt(); n !=0; n = sc.nextInt()) {
			int[] score = new int[n];
			for(int i = 0;i<n;i++) {
				score[i] = sc.nextInt();
			}
			for(int i=0; i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(Math.abs(score[i]-score[j])<d) {
						d = Math.abs(score[i]-score[j]);
					}
				}
			}
			System.out.println(d);
			d=1000000;
		}
	}
}

