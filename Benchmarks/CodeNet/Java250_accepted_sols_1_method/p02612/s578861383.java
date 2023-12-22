import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%1000==0) {
			System.out.println("0");
		}
		else {
			int y = n%1000;
			System.out.println(1000-y);
		}
	}

}