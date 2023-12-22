//InfiniteCoins.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int a=sc.nextInt();
        
        int sum=0;
        for(int i=0; i<n; i++){
            sum=n-500*i;
            if(sum<500){
                break;
            }
        }
        if(sum<=a){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}