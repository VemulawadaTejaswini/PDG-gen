import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m,f,r;

		while(true) {
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			if(m==-1 && f==-1 && r==-1) break;
			System.out.println(check(m,f,r));
		}

		scan.close();
	}

	static String check(int m,int f,int r) {
		int sum = m+f;
		if(m==-1 || f==-1) return "F";
		if(sum>=80) return"A";
		if(sum>=65 && sum<=80) return "B";
		if(sum>=50 && sum<=65 || r>=50) return "C";
		if(sum>=30 && sum<=50) return "D";
		return "F";
	}

}
