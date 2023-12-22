

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String str = br.readLine().trim();
        StringTokenizer stk = new StringTokenizer(str);
        int n = Integer.parseInt(stk.nextToken());
        int[] a = new int[n];
        str = br.readLine().trim();
        stk = new StringTokenizer(str);
        for(int i=0;i<n;i++) {
        	a[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(a);
        int alice=0,bob=0;boolean flag=true;
        for(int i=n-1;i>-1;i--) {
        	if(flag==true) {
        		alice+=a[i];flag=false;
        	}
        	else if(flag==false) {
        		bob+=a[i];flag=true;
        	}
        }
        System.out.println(alice-bob);

	}

}
