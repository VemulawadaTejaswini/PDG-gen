import java.util.Scanner;
import java.math.*;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int n = in.nextInt();
		in.useDelimiter("[\\s*[,\\n]\\s*]");
		int[] ls = new int[w];
		for(int i=0; i<w; i++)
			ls[i] = i+1;
		for(int iter=0; iter<n; iter++){
			int a, b;
			a = in.nextInt();
			b = in.nextInt();
			int tmp = ls[a-1];
			ls[a-1] = ls[b-1];
			ls[b-1] = tmp;
		}
		for(int iter=0; iter<w; iter++)
			System.out.println(ls[iter]);
	}

}