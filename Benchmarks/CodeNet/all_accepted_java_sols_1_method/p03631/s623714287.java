



import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		StringBuffer sb=new StringBuffer(a);
		String b=sb.reverse().toString();

		if(Integer.parseInt(a)-Integer.parseInt(b)==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}