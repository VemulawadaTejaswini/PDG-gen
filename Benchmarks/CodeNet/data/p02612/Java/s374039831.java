import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		if(n%1000==0) System.out.println("0");
		else
		{
			String a=Integer.toString(n);
			String t="";
			for(int i=1;i<a.length();i++)
			{
				t+=a.charAt(i);
			}
			int c=Integer.parseInt(t);
			System.out.println(Math.abs(1000-c));
		}
	}

}
