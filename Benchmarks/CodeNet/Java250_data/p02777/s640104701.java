
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		String y=sc.next();
		int n=sc.nextInt();
		int h=sc.nextInt();
		String s=sc.next();
		if(s.equals(y))
			h--;
		else
			n--;
		System.out.println(n+" "+h);




	}

}
