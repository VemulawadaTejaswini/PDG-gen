import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
      	int A = scn.nextInt();
      	int B = scn.nextInt();
      	int C = scn.nextInt();
      	int min = A + B + C - Math.max(A, Math.max(B, C));
      	System.out.println(min);
      	scn.close();
    }
}