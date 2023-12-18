import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n =sc.nextInt();
		for (int i = 0;; i++) {
			long p = (long)Math.pow(3, i);
			if(n <= p){
				System.out.println(i);
				break;
			}
		}
	}

}