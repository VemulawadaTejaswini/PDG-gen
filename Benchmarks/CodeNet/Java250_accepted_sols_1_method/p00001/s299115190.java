import java.io.*;

class Main {
    public static void main (String args[]) throws IOException {
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);

	int tall[] = new int[10];
	int high[] = new int[3];
	int n = 0;
	
	for (int i=0; i<10; i++) {
	    tall[i] = Integer.parseInt(br.readLine());
	}
	
	for (int i=0; i<3; i++) {
	    for (int j=0; j<10; j++) {
		if (high[i] < tall[j]) {
		    high[i] = tall[j];
		    n = j;
		}
	    }
	    tall[n] = 0;
	}
	
        for (int i=0; i<3; i++) {
	    System.out.println(high[i]);
	}
	
    }
}