import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  int X = Integer.parseInt(sc.next());
	  
	  int D = 0;
	  int count = 1;
	  for(int i = 0; i < N; i++) {
		  D += Integer.parseInt(sc.next());
		  if(D <= X)
			  count++;
		  else
			  break;
		  
	  }
	  System.out.println(count);
	  sc.close();
	  
  }
}
