//ColorfulTransceivers.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int sum0=Math.abs(c-a);
        int sum1=Math.abs(b-a);
        int sum2=Math.abs(c-b);

        if(sum0<=d){
            System.out.println("Yes");
        }
        else{
            if(sum1<=d&&sum2<=d){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}