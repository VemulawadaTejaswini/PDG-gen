import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int max = 1;
		sc.close();
		for(int i=2;i<x;i++) {
			int pow = 2;
			while(true) {
				int num = (int) Math.pow(i,pow);
				if(num>x) break;
				if(num>max) max = num;
				pow++;
			}
			if(pow == 2) break;
		}
		System.out.println(max);
	}
}