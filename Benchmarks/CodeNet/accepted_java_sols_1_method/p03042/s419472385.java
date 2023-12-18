import java.util.*;

public class Main{
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b = a/100;
	  int c = a - b*100;
	  if(b > 12 || b < 1) {
		  if(c > 12 || c < 1) {
			  System.out.println("NA");
		  }
		  else {
			  System.out.println("YYMM");
		  }
	  }
	  else if(b < 13 && b > 0) {
		  if(c > 12 || c < 1) {
			  System.out.println("MMYY");
		  }
		  else {
			  System.out.println("AMBIGUOUS");
		  }
	  }
  }
}