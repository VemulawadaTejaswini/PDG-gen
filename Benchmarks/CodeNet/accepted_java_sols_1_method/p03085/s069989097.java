import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		String s = sc.next();
		long count=0;
		long l=0,x=0;
		//long[][] array=new long[n][2];
		if(s.equals("A")) {
			System.out.println("T");
		}else if(s.equals("T")) {
			System.out.println("A");
		}else if(s.equals("C")) {
			System.out.println("G");
		}else {
			System.out.println("C");
		}

		//System.out.println(count);
	}
}


