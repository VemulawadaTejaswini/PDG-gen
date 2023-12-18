import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
      int sum = 0;
      
      if(a == 5 || a == 7) {
      	sum += a;
      }
      if(b == 5 || b == 7) {
      	sum += b;
      }
      if(c == 5 || c == 7) {
      	sum += c;
      }
      
      if(sum == 17) {
      	System.out.print("YES");
      } else {
      	System.out.print("NO");
      }
      scan.close();
	}

}
