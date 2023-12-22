import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  int D = Integer.parseInt(sc.next());
	  
	  int temp = D * 2 + 1;
	  int a = N / temp;
	  int b = N % temp;
	  
	  if(b == 0) {
		  System.out.println(a);
	  }
	  else {
		  System.out.println(a + 1);
	  }
	  sc.close();
	  
  }
}
