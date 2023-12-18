

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        
        int A = Integer.parseInt(str);
        str = br.readLine().trim();
        int B = Integer.parseInt(str);
        str = br.readLine().trim();
        int C = Integer.parseInt(str);
        str = br.readLine().trim();
        int D = Integer.parseInt(str);
        System.out.println(Math.min(A, B)+Math.min(C,D));

	}

}
