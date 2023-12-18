import java.util.*;
public class Main{

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n =sc.nextLine();
		n.trim();
		double sum=0.0;
		for(int i=0;i<n.length();i++)
		{
			sum+=(n.charAt(i)-48);
		}
		if(sum%9==0)          //200000*9 = 18000000
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
