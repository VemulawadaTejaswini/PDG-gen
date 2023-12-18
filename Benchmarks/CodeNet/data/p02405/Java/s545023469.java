import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	while(true) {
    		int H = sc.nextInt();
    		int W = sc.nextInt();
    		if(H == 0 && W == 0) {
    			break;
    		}
    		for(int h = 1; h <= H; h ++) {
    			for(int w = 1; w <= W; w ++) {
    				if(w % 2 == 1 || h % 2 == 1 || w == 1 || h == 1) {
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
