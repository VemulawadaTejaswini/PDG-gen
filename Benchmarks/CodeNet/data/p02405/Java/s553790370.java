import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int H = sc.nextInt();
    		int W = sc.nextInt();
    		int a = 1;
    		int b = 1;
    		if(H == 0 && W == 0) {
    			break;
    		}
    		for(int h = 0; h < H; h ++, a ++) {
    			for(int w = 0; w < W; w ++, b ++) {
    				if(a % 2 == 1) {
    					if(b % 2 == 0) {
    						System.out.print("#");
    					}
    					else {
    						System.out.print(".");
    					}
    				}
    				else {
    					if(b % 2 == 1) {
    						System.out.print("#");
    					}
    					else {
    						System.out.print(".");
    					}
    				}
    			}
    			System.out.println("");
    		}
    		System.out.println("");
    		b = 0;
    	}
    }
}
