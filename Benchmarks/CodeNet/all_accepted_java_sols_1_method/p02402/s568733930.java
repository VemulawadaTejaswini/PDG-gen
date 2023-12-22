import java.util.*;
import java.util.Arrays;
public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
	   sc = new Scanner(System.in);
	   int a=sc.nextInt();
	   int []b=new int[a];
	   long d=0;
	   for(int i=0;i<a;i++){
		   b[i]=sc.nextInt();
	   }
	   Arrays.sort(b);
	   for(int i=0;i<a;i++){
		  d+=b[i]; 
	   }
	   System.out.println(b[0]+" "+b[a-1]+" "+d);
	}

	

}