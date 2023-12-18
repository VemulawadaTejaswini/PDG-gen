import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String ans=sc.next();
        int sum=0;

        if(ans.equals(s)){
            sum=a-1;
            System.out.println(sum+" "+b);
        }
        if(ans.equals(t)){
            sum=b-1;
            System.out.println(a+" "+sum);
        }
        sc.close();
    }
}