import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int min=0;
		int max=0;
		for(int i=0; i<m; i++) {
			if(i==0) {
				min= sc.nextInt();
				max = sc.nextInt();
			}else {
				int min0 = sc.nextInt();
				int max0 = sc.nextInt();
				if(min0 > min) {min = min0;}
				if(max0 < max) {max = max0;}
			}
		}
		if(max >= min) {
			System.out.println(max-min+1);
		}else {
			System.out.println(0);
		}
	}
}