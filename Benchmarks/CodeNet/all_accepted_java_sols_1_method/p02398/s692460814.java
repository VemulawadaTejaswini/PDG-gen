import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		int a,b,c;
		int i,cnt=0;

		Scanner scan = new Scanner(System.in);

	    a = scan.nextInt();
	    b = scan.nextInt();
	    c = scan.nextInt();

	    for(i=a; i<=b; i++)
	    {
	    	cnt = (c%i==0) ? ++cnt : cnt;
	    }

	    System.out.println(cnt);

		scan.close();
	}
}