import java.io.*;

class Researcher {
	int n;
	int c[] = {0,0,0};

	Researcher(int n) {
		this.n = n;
	}

	int Two() {
		while (this.n%2==0) {
			c[2]++;
			this.n /= 2;
		}
		return c[2];
	}

	int Five() {
		while (this.n%5==0) {
			c[1]++;
			this.n /= 5;
		}
		return c[1];
	}

	int Ten() {
		while (this.n%10==0) {
			c[0]++;
			this.n /= 10;
		}
		return c[0];
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine()).equals("0")==false) {
				int c[] = {0,0,0};
				int n = Integer.parseInt(buf);
				for (int i=1;i<=n;i++) {
					Researcher r = new Researcher(i);
					c[0] += r.Ten();
					c[1] += r.Five();
					c[2] += r.Two();
				}
				System.out.println(c[0]+Math.min(c[1],c[2]));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}