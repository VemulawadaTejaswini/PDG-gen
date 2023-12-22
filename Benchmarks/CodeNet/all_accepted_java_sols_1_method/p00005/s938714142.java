import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String t[], s;
			int a[] = new int[2];
			int c;
			while((s = reader.readLine())  != null) {
				t = s.split(" ");
				for(int i = 0;i < a.length;i++) {
					a[i] = Integer.parseInt(t[i]);
				}
				int a0_tmp = a[0], a1_tmp = a[1];
				while(true) {
					c = a0_tmp % a1_tmp;
					if(c == 0)
						break;
					a0_tmp = a1_tmp;
					a1_tmp = c;
				}
				System.out.printf("%d %d\n", a1_tmp, a[0]/a1_tmp*a[1]);

			}

		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}