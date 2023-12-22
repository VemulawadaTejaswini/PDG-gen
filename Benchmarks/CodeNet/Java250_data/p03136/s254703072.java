import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] min = new int[n-1];
		int max = scn.nextInt();;
		for(int i = 0;i<n-1;i++) {
			int x = scn.nextInt();
			if(max<x) {
				min[i]=max;
				max = x;
			}else {
				min[i]=x;
			}
		}
		int sum = 0;
		for(int x:min) {
			sum+=x;
		}
		if(max<sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}