import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);		
		int N = in.nextInt();
        int M = in.nextInt();
      
      if((M-N)%2==0){System.out.print(M-(M-N)/2);}
      else{System.out.print("IMPOSSIBLE");}
        
        
      }
	}