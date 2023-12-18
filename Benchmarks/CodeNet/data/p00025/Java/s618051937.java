import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String args[]) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	try {
	    String s[] = new String[2];
	    while ((s[0] = br.readLine())!=null) {
		s[1] = br.readLine();
		StringTokenizer st[] = new StringTokenizer[2];
		st[0] = new StringTokenizer(s[0]);
		st[1] = new StringTokenizer(s[1]);
		int a[] = new int[4];
		int b[] = new int[4];
		for (int i=0;i<4;i++) {
		    a[i] = Integer.parseInt(st[0].nextToken());
		    b[i] = Integer.parseInt(st[1].nextToken());
		}

		int hit = 0;
	        int blow = 0;
		for (int i=0;i<4;i++) {
		    for (int j=0;j<4;j++) {
			if (a[i]==b[j]) {
			    if (i==j) hit++;
			    else blow++;
			}
		    }
		}
		System.out.println(hit+" "+blow);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    } 
}