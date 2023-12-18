import java.util.Scanner;

public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  while (in.hasNext()) {
	int ans = 0;
	for (int a = in.nextInt(), b = in.nextInt(), i = in
	    .nextInt(); i > 0; i--) {
	  ans += (a * 10 / b) % 10;
	  a = a * 10 % b;
	  if (a == 0) break;
	}
	System.out.println(ans);
  }
}
}