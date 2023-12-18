import java.util.*;
class Main{
  	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    	int D = scan.nextInt();
      	int T = scan.nextInt();
      	int S = scan.nextInt();
      	long reqTime = (long)(D / S);
      	long time = (long)T;
      	if(reqTime > T) {
        	System.out.println("No");
        }else {
        	System.out.println("Yes");
        }
    }
}