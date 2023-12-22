import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int a1 = 0;
		int a2 = 0;
		int mi = 0;
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			if (a2 > a)
				continue;
			a2 = a;
			if (a1 < a2) {
				int t = a1;
				a1 = a2;
				a2 = t;
				mi = i;
			}
		}
		for(int i=0;i<n;i++)
			if(i==mi)
				System.out.println(a2);
			else
				System.out.println(a1);
		in.close();
	}
}
