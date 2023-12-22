import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      	Scanner scan = new Scanner(System.in);
      	String[] nm = scan.nextLine().split(" ");
      	String[] a = scan.nextLine().split(" ");
      	int n = Integer.parseInt(nm[0]);
      	int m = Integer.parseInt(nm[1]);
      	for (int i = 0; i < m; i++) {
      		n -= Integer.parseInt(a[i]);
      	}
      	if (n < 0) {
      		n = -1;
      	}
    	System.out.println(n);
    }
}