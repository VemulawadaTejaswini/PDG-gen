import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
	// 2020/2/24 T or T
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String strArray[] = br.readLine().split(" ");
	int N, A, B;
	N = Integer.parseInt(strArray[0]);
	A = Integer.parseInt(strArray[1]);
	B = Integer.parseInt(strArray[2]);
	if (N * A < B)
	    System.out.println(N * A);
	else
	    System.out.println(B);
    }
}