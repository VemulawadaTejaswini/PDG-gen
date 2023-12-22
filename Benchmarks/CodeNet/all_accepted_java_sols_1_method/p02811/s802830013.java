import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
      
      if(500*N >= X) {
      	System.out.print("Yes");
      } else {
      	System.out.print("No");
      }
	
	return;

	}
}