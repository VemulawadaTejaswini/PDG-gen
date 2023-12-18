import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int H = sc.nextInt();
    		int W = sc.nextInt();
    		int c = 0;
    		if(H == 0 && W == 0) {
    			break;
    		}
    		for(int h = 1; h <= H; h ++) {
    			for(int w = 1; w <= W; w ++, c ++) {
    				if(c % 2 == 0) {
    					System.out.print("#");
    				}
    				else {
    					System.out.print(".");
    				}
    			}
    			System.out.println("");
    		}
    		System.out.println("");
    	}
    }
}
