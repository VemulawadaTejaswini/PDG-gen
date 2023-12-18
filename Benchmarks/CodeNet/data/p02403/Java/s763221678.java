import java.util.*;


public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		    int H = sc.nextInt();
		    int W = sc.nextInt();
		    if (H == 0 && W == 0) break;
		    
		    for (int i = 0; i<H; i++) {
		        for (int t= 0; t<W; t++) {
		            System.out.print("#");
		        }
		    System.out.println("");
		    }
		    System.out.println("");
		}

		
    }
}
