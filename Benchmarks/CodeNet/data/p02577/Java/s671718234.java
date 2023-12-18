import java.util.Scanner;
class hru { 

    public static void main(String arg[]) 

    {
		Scanner scan=new Scanner(System.in);
		String s;
		int sum=0;
		s=scan.nextLine();
		int k=s.length();
		for(int i=0;i<k;i++)
		{
			int p=Integer.parseInt(s.substring(i,i+1));
			sum=sum+p;
		}
		if(sum%9==0)
			System.out.println("Yes");
		else
			System.out.println("No");
    } 

} 