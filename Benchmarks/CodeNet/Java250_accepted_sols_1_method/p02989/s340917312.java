import java.util.*;
import static java.lang.System.*;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  int[] d = new int[N];
	  for(int i=0; i<N; i++)
		  d[i] = sc.nextInt();
	 
	  Arrays.sort(d);
	  
	  int a = d[N/2 - 1];
	  int b = d[N/2];
	  int ans = b-a;
	  
	  out.print(ans);
  	}
  }	 