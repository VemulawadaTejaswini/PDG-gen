//WeLoveGolf.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=b/k;
        int ans=k*sum;
        //System.out.println("sum"+sum);
        //System.out.println("ans"+ans);

        if(ans>=a){
            System.out.println("OK");
        }
        else{
            System.out.println("NG");
        }
        sc.close();
    }
}