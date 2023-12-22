import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int T = sc.nextInt();

    int now = 0;
    int bis = 0;
    while (true) {
    	if (now > T+0.5) {
    		bis -= B;
        	now -= A;
    		break;
    	}
    	bis += B;
    	now += A;
    }
    System.out.println(bis);
  }
}