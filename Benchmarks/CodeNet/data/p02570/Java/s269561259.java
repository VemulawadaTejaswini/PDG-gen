import java.util.*;
class Main{
  	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    	int D = scan.nextInt();
      	int T = scan.nextInt();
      	int S = scan.nextInt();
      	long reqTime = D / S;
      	if(reqTime <= T) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
    }
}