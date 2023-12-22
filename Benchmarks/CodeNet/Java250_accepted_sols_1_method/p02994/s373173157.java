import java.util.*;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int N = Integer.parseInt(sc.next());
	  int L = Integer.parseInt(sc.next());
	  
	  int[] appleValue = new int[N];
	  int sum = 0;
	  int a = 0;
	  int min = 9999;
	  for(int i = 0; i < N; i++) {
		  int value = L + i;
		  appleValue[i] = value;
		  sum += appleValue[i];
		  
		  if(min > Math.abs(value)) {
			  min = Math.abs(value);
			  a = value;
		  }
	  }
	  System.out.println(sum - a);
	  	  
	  
  }
}
