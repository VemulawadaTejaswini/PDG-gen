

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
        StringTokenizer stk = new StringTokenizer(str);
        int A = Integer.parseInt(stk.nextToken());
        int B = Integer.parseInt(stk.nextToken());
        int C = Integer.parseInt(stk.nextToken());
        int X = Integer.parseInt(stk.nextToken());
        int Y = Integer.parseInt(stk.nextToken());
        long first=0l,second=0l,third = 0l;
        first = (long)A*X+B*Y;
        //System.out.println(Math.min(A, B)+Math.min(C,D));
        if(X>Y) {
        	int left = X-Y;
        	second = (long)Y*2*C;second+=left*A;
        }
        else {
        	int left = Y-X;
        	second = (long)X*2*C;second+=left*B;
        }
        if(X>Y)third = (long)(X+X)*C;
        else third = (long)(Y+Y)*C;
        System.out.println(Math.min(first, Math.min(second, third)));
	}

}
