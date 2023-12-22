import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
      int[] a=new int[n];
      
      for(int i=1;i<=n;i++){
        int h=sc.nextInt();
        a[h-1]=i;
      }
      for(int b:a){
      	System.out.println(b);
      }
      
    }
}