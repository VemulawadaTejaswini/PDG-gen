import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] s = new int[3];
		int sum=0;
	        for(int i=0 ; i<3 ; i++) {
	        	do {
	        	s[i] = stdIn.nextInt();
	        	}while(s[i]<1||s[i]>14);
        	sum += s[i];
        }
	        if(sum>=22) {
	        	System.out.println("bust");
	        }else {
	        	System.out.println("win");
	        }
	}
}
