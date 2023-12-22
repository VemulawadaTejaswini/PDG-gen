import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	try {
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int a[] = new int[5];
	    for (int i=0;i<5;i++) {
		a[i] = Integer.parseInt(st.nextToken());
	    }
	    Arrays.sort(a);
	    System.out.println(a[4]+" "+a[3]+" "+a[2]+" "+a[1]+" "+a[0]);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}