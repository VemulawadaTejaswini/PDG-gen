
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main{
       
	public static void main(String[] args) {
		Scanner sdf = new Scanner(System.in);
		
                int t=1;
                while(t-->0){
                    int n=sdf.nextInt();
                    int k=0;
                    int []a=new int[n];
                    for(int i=0;i<n;i++){
                        a[i]=sdf.nextInt();
                        k=k+a[i];
                    }
                    int fl=(int)Math.floor((double)k/(double)n);
                    int sum1=0;
                    for(int i=0;i<n;i++){
                       
                        sum1=sum1+(int)Math.pow(a[i]-fl, 2);
                                
                    }
                    
                    int c=(int)Math.ceil((double)k/(double)n);
                    int sum2=0;
                    for(int i=0;i<n;i++){
                        
                        sum2=sum2+(int)Math.pow(a[i]-c, 2);
                    }
                    System.out.println(Math.min(sum1, sum2));
                }                
        }
   

}