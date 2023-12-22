import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   long sum = 0;
	   int a = sc.nextInt();
	   int[] c = new int[10000];
	   for(int i = 0; i < a; i++) {
	       c[i] = sc.nextInt();
	   }
	   
	   int max = c[0];
	   int min = c[0];
	  
	   for (int i = 0; i < a; i++) {
	        sum += c[i];
	        if (min > c[i]) {
	        	min = c[i];
	        } else if (max < c[i]) {
	        	max = c[i];
	        }
	     }
       System.out.printf("%d %d %d\n", min, max, sum);
   }
}
