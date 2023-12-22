import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int sum=c-(a-b);
		
		if(sum>=0){
			System.out.println(sum);
		}
		else{
			System.out.println(0);
		}
	}
}