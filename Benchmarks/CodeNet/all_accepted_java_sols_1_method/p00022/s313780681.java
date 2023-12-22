import java.io.*;

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
	    while (true) {
		int n = Integer.parseInt(br.readLine());
		if (n==0) break;
		int a[] = new int[n];
		for (int i=0;i<n;i++)
		    a[i] = Integer.parseInt(br.readLine());
		int max = a[0];
		for (int i=0;i<n;i++) {
		    int d = 0;
		    for (int j=i;j<n;j++) {
			d += a[j];
			if (d>max) max = d;
		    }
		}
		System.out.println(max);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    } 
}