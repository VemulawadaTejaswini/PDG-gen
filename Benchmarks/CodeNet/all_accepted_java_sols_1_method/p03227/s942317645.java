import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();

		if(a.length()==2) {
			System.out.println(a);
		}
		else {
			String x=a.charAt(2)+""+a.charAt(1)+""+a.charAt(0);
			System.out.println(x);
		}
	}
}