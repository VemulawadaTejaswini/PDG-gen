import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		long[] number = new long[a];
		for(int i=0;i<a;i++) {
			number[i] = sc.nextLong();
		}
		long result = 0;
		result = number[0];
		boolean flag = true;
		for(int i=0;i<a;i++) {
			if(number[i] == 0) {
				System.out.println(0);
				return;
			}
		}
		
		for(int i=1;i<a;i++) {
			result = result*number[i];
			if(result > 1000000000000000000l) {
				System.out.println(-1);
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println(result);
		}
		
		
			
		

	}

}
