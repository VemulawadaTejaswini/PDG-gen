import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int hei = sc.nextInt();
			int wid = sc.nextInt();
			String frame = "";
			for (int i = 0; i < wid+2; i++) {
				frame = frame +"#";
			}

			String[] a = new String[hei];
			for (int i = 0; i < hei; i++) {
				a[i] = sc.next();
			}
			for (int i = 0; i < hei; i++) {
				a[i] = "#"+a[i]+"#";
			}

			System.out.println(frame);
			for (int i = 0; i < hei; i++) {
				System.out.println(a[i]);
			}
			System.out.println(frame);

		    sc.close(); }
}
