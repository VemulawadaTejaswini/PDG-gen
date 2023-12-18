import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	
      	
      	for (int n=1; n<=N; n++) {
          	int c = 0;//counter
        	for (int x=1; x<=Math.sqrt(N); x++) {
            	for (int y=1; y<=Math.sqrt(N); y++) {
                	for (int z=1; z<=Math.sqrt(N); z++) {
                    	if (x*x + y*y + z*z + x*y + y*z + z*x == n) {c++;}
                    }
                }
            }
          	System.out.println(c);
        }
    }
}