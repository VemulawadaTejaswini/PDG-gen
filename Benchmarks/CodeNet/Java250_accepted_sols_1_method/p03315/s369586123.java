import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//String t = sc.next();
		//String g = sc.next();
		//long n = sc.nextLong();
		//long m = sc.nextLong();
		//long k = sc.nextLong();
		//long l = sc.nextLong();
		long count=0;

		for(int i=0;i<=3;i++) {
			if(s.substring(i,i+1).equals("+")) {
				count++;
			}else {
				count--;
			}
		}
		/*if(n<=8 && m<=8) {
			System.out.println("Yay!");
		}else{
			System.out.println(":(");
		}*/
		//System.out.println((int)Math.ceil((n+m)/2.0));
		System.out.println(count);
	}
}


