import java.util.Scanner;
import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{	Scanner s = new Scanner(System.in);
                
                int n=s.nextInt();
                int[] a = new int[n];
                int[] b = new int[100];
                int i=0,sum=0,t=1,r=0;
                float sum1=0;
                for(i=0;i<n;i++){
                   a[i] = s.nextInt();
                }
                for(i=0;i<n-1;i++){
                     
                   if(a[i]==a[i+1]){
                      t++;
                   }else{
                      t = t/2;
                      sum = sum + t;
                    //   System.out.println(t);
                      t=1;
                   }
                   if(i==n-2 && a[i]==a[i+1]){
                      r=1;
                   }

                }
                if(r==1){
                    t = t/2;
                      sum = sum + t;
                }
                System.out.println(sum);
                
                
	}
}