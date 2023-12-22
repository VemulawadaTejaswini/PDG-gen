import java.util.*;

class Main {

	public static void main(String... args) {
  	  Scanner stdin = new Scanner(System.in);

      int args1 = stdin.nextInt();
      int args2 = stdin.nextInt();
      int args3 = stdin.nextInt();
      
      int answer = args3/args1*args2;
      
      System.out.println(answer);
	}
}