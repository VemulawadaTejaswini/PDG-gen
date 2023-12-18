import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,m;
		while(n>0)
		{
			m=n%10;
			sum=sum+m;
			n=n/10;
		}
		if(sum%9==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
			
	}

}
