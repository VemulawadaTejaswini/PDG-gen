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

	       for(int i=0;i<H;i++) {
		       for(int j=0;j<W;j++) {
			       System.out.printf("#");
		       }
		       System.out.println("");
	       }
	       System.out.println("");
       }
    }
}