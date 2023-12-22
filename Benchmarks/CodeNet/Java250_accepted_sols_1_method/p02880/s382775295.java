import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
	  
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  scanner.close();
	  String ans = "No";
	  for (int i = 1; i <= 9; i++) {
		  if (n % i == 0) {
			  Integer c = n / i;
			  String dString = c.toString();
			  if (dString.length() == 1) {
				ans = "Yes";
				break;
			}
		}	
	}
	  System.out.println(ans);

  }
}