
import java.util.*;
public class Main{
	public static void main(String[]agrs){
		Scanner sc=new Scanner(System.in);
	   int x[]=new int [5];
	   for(int i=0;i<x.length;i++){
		   x[i]=sc.nextInt();
	   }Arrays.sort(x);
	   for(int j=4;j>=0;j--){
		   System.out.print(x[j]);
		   if(j!=0){
			   System.out.print(" ");
		   }
		   
	   }
	   System.out.println();
	}
}