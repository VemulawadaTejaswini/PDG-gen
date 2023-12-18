public class Main {


	public static void main(String[] args) {
		  java.util.Scanner scan = new java.util.Scanner(System.in);
		  int n = scan.nextInt();
		  int i = 1;
		  if(3<= n && n <= 10000){
		  do {
		   int x = i;
		   if (x % 3 == 0) {
		    System.out.print(" " + i);
		   } else {
		    do {
		     if (x % 10 == 3) {
		      System.out.print(" " + i);
		      break;
		     }
		     x /= 10;
		    } while (x != 0);
		   }
		  } while (++i <= n);
		  
		 }
		
	}
}