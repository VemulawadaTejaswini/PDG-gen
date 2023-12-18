import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);

		while(true){
			int m = in.nextInt();
			int f = in.nextInt();
			int r = in.nextInt();
			if(m == -1 && f == -1){
				if(r == -1){
					break;
				} else {
					System.out.println("F");
				}
			} else if(m + f >= 80){
				System.out.println("A");
			} else if(m + f >= 65){
				System.out.println("B");
			} else if(m + f >= 50){
				System.out.println("C");
			} else if(m + f >= 30){
				if(r >= 50){
					System.out.println("C");
				} else {
					System.out.println("D");
				}
			} else {
				System.out.println("F");
			}
		}
	}
}