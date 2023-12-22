import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String [] args)throws Exception{
		BufferedReader Reader = new BufferedReader (new InputStreamReader(System.in));
		int j=0;
		int N = Integer.parseInt(Reader.readLine());
		String A[] = Reader.readLine().split(" ",0);
		for(int i=0;i<=N-1;i++){
			String v = A[i];
			j = i-1;
			while (j>=0 && Integer.parseInt(A[j])>Integer.parseInt(v)){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			System.out.println(String.join(" ",A));
		}
	}
}