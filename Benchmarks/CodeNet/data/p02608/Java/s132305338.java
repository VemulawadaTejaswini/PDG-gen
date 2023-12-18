import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	
      	
      	for (int n=1; n<=N; n++) {
          	int c = 0;//counter
        	for (int x=1; x<=Math.sqrt(N); x++) {
            	for (int y=x; y<=Math.sqrt(N); y++) {
                	for (int z=y; z<=Math.sqrt(N); z++) {
                    	if (x*x + y*y + z*z + x*y + y*z + z*x == n) {
                        	if ((x==y)&&(y==z)) {c++;}
                          	else if (x==y) {c+=3;}
                          	else if (y==z) {c+=3;}
                          	else {c+=6;}
                        }
                    }
                }
            }
          	System.out.println(c);
        }
    }
}