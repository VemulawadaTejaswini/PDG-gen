import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static final int NUM=1000;

	private static int[][] graph= {
			{0},							// A
			{1, 0},							// B
			{0, 1, 0},						// C
			{1, 0, 0, 0},					// D
			{0, 1, 0, 1, 0},				// E
			{0, 0, 1, 0, 1, 0},				// F
			{0, 0, 0, 1, 0, 0, 0},			// G
			{0, 0, 0, 0, 1, 0, 1, 0},		// H
			{0, 0, 0, 0, 0, 1, 0, 1, 0},	// I
		//	 A  B  C  D  E  F  G  H  I
	};

	private static boolean check(String str) {
		char[] array=str.toCharArray();
		for(int i=0; i<array.length-1; i++)
			if(!neighbor(array[i], array[i+1]))
				return false;
		return true;
	}

	private static boolean neighbor(char p, char n) {
		if(p<n)
			return graph[n-'A'][p-'A']==1;
		else
			return graph[p-'A'][n-'A']==1;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);

		for(int i=0; i<NUM; i++) {

			String s=br.readLine();

			if(check(s))
				System.out.println(s);
		}
	}

}