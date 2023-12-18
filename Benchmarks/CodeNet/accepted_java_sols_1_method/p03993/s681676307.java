import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
 
public class Main {
	static Scanner in;
	static int n, a[];
	static long ans = 0;
	public static void main(String[] args) throws FileNotFoundException {
//		in = new Scanner(new File("input.txt"));
		in = new Scanner(System.in);
		n = in.nextInt();
		a = new int[n + 1];
		for(int i = 1;i <= n;i++){
			a[i] = in.nextInt();
		}
		for(int i = 1;i <= n;i++){
			int j = a[i];
			if(j <= n && j >= 1){
				if(a[j] == i) ans++;
			}
		}
		System.out.println(ans/2);
	}
}