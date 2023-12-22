import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader stdReader =
		new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(stdReader.readLine());
		String A[] = stdReader.readLine().split(" ",0);
		int j = 0;
		System.out.println(String.join(" ",A)); 
		for (int i = 1; i < N; i++) {
			String v = A[i];
			j = i - 1;
			while (j >= 0 && Integer.parseInt(A[j]) > Integer.parseInt(v)) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			System.out.println(String.join(" ",A)); 
		}
	}
}