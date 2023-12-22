import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] in=new int[n];
		for (int i=0;sc.hasNext();i++)
			in[i]=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (in[i] < in[j]) {
					int tmp = in[i];
					for (int l=i; l > j; l--)
						in[l] = in[l - 1];
					in[j] = tmp;break;
					}

			}System.out.print(in[0]);
					for (int l = 1; l < n; l++)
						System.out.print(" " + in[l]);
					System.out.println();
		}

	}

}