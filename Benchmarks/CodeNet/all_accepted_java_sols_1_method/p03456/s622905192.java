import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      double a = sc.nextInt();
	      double b = sc.nextInt();
          String ans = "No";
          if(b == 100) {
        	  a = a*1000 + b;
          }
          else if(b < 100 && b > 9) {
        	  a = a*100 + b;
          }
          else if(b < 10){
        	  a = a*10 + b;
          }
          for(int i = 1;i<=317;i++) {
        	  if (i == a/i) {
        		  ans = "Yes";
        	  }
          }
	      System.out.println(ans);
	}
}