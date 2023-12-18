import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int int500 = sc.nextInt();
		int int100 = sc.nextInt();
		int int50 = sc.nextInt();
		int total = sc.nextInt();
		int count= 0;
		for(int a = 0 ; a <= int500 ;a++) {
			for(int b = 0 ; b <= int100;b++) {
				for(int c = 0; c <= int50;c++) {
					int sum = a*500 + b*100 + c*50;
					if(sum == total)count++;
				}
			}
		}
		System.out.println(count);
	}
}