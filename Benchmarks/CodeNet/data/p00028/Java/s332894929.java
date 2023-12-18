import java.io.*;
import java.util.StringTokenizer;

class Counter {
	int count[] = new int[100];

	Counter() {
		for (int i=0;i<100;i++)
			this.count[i] = 0;
	}

	void add(int n) {
		this.count[n-1]++;
	}

	void printModeValue() {
		int max = 0;
		for (int i=0;i<100;i++)
			if (this.count[i]>max) max = this.count[i];
		for (int i=0;i<100;i++)
			if (max==this.count[i]) System.out.println(i+1);
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			Counter c = new Counter();
			while ((buf = br.readLine())!=null) {
				c.add(Integer.parseInt(buf));
			}
			c.printModeValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}