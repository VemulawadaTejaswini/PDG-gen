import java.util.Scanner;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int N2 = Integer.parseInt(sc.next());
    int N3 = Integer.parseInt(sc.next());
    for(; N2 <= N3; N2++) {
    	if(N2 % N == 0) {
    		System.out.println("OK");
    		break;
    	}

    	if(N2 == N3) {
			System.out.println("NG");
    	}
    }

  }
}