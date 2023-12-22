import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();

		if(k==10) {
			System.out.println(s.length());
		}else {
			long n=0;
			while(Math.pow(k,n)<Long.valueOf(s)+1) {
				n++;
			}
			System.out.println(n);
		}
	}
}

