import java.util.*;
class Solution{
  	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    	int D = scan.nextInt();
      	int T = scan.nextInt();
      	int S = scan.nextInt();
      	if(D / T <= S) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}