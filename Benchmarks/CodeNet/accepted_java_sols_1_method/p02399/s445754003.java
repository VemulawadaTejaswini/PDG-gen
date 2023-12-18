import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b,d=0,r;
		double f;

	    Scanner sc = new Scanner(System.in);
	    a = sc.nextInt();
	    b = sc.nextInt();

	    r = a%b;
	    f = (double)a/(double)b;

	    while(a>=b) {
	    	a = a-b;
	    	d++;
	    }

	    System.out.println(String.format("%d %d %.6f",d,r,f));
	}


}

