import java.io.*;
 
class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
	    int n = Integer.parseInt(br.readLine());
	    long f = 1;
	    for (int i=2;i<=n;i++) {
		f *= (long)i;
	    }
	    System.out.println(f);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}