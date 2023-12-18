import java.util.*;

class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=Integer.parseInt(Integer.toString(a).concat(Integer.toString(b)));
		if((int)Math.sqrt(c)*(int)Math.sqrt(c)==c)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}