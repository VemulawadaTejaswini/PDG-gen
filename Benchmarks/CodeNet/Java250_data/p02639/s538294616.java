import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i<5; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == 0) 
				System.out.println(i+1);
		}
	}
}
