import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int W = in.nextInt();
       int H = in.nextInt();
       int x = in.nextInt();
       int y = in.nextInt();
       int r = in.nextInt();

       if(0 <= x-r && x+r <= W &&
		0 <= y-r && y+r <= H) {
       	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }
}