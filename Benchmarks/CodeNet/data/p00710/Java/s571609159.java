
import java.util.Scanner;

public class Main {
   public static void main (String[] agrs) {
	   Scanner input = new Scanner(System.in);
	   int count =1;
	   while(true) {
		   int n = input.nextInt();
		   int N [] = new int [n];
		   for(int i =0;i<n;i++) {
			   count++;
			   N[i]=count;
		   }
		   int r = input.nextInt();
		   if(n==0||r==0) {
			   System.exit(0);
		   }
		   for(int i =0;i<r;i++) {
		   int p = input.nextInt();
		   int c = input.nextInt();
		   if(p + c > n +1) {
			   System.exit(0);
		   }
		   String str = N.toString();
		   String C = str.substring(p,c);
		   String P = str.substring(0,p);
		   str = C + P;		   
		   }
		   System.out.println(N[0]);
	   }
     }
}

