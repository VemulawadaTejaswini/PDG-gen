import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  
	  int H1 = Integer.parseInt(sc.next());
	  int count = 0;
	  int max = 0;
	  for(int i = 0; i < N - 1; i++) {
		  int H2 = Integer.parseInt(sc.next());
		  if(H1 >= H2) {
			  count++;
			  if(count > max) {
				  max = count;
			  }
		  }
		  else {
			  count = 0;
		  }
		  H1 = H2;
	  }
	  System.out.println(max);
	  sc.close();
	  
  }
}
