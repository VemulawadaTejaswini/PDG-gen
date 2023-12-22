import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		 int b[]=new int[a];
		 for(int i=0;i<a;i++)
			 b[i]=sc.nextInt();
		int c=1;
		int s=b[0];
		for(int i=1;i<a;i++){
			if(s<=b[i]){
			  s=b[i];
			  c++;
		  }
		  		}
		System.out.println(c);
	}
}