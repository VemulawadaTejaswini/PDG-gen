//package AtCoder;
import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int a=sc.nextInt();
		int c=0;
		int ans=h/a;
		if(h%a==0)
			System.out.println(ans);
		else
		{
			ans=ans+1;
			System.out.println(ans);
		}
	}

}
