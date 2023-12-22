//BuyingSweets.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        int ans=0;
        int sum=x-a;
        //System.out.println(sum);
        for(int i=0; i<x; i++){
            ans=sum-b*i;
            if(ans<b){             
                break;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}