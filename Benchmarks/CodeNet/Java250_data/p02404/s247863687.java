import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);

       while(in.hasNextInt()) {
	       int H = in.nextInt();
	       int W = in.nextInt();
	       if(H == 0 && W == 0) return;

	       for(int i=1;i<=H;i++) {
		       for(int j=1;j<=W;j++) {
			       if(i==1 || i == H || j == 1 || j == W)
				       System.out.printf("#");
			       else
				       System.out.printf(".");
		       }
		       System.out.println("");
	       }
	       System.out.println("");
       }
    }
}