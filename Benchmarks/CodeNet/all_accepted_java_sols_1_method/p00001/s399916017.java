import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int a[] = new int[10];
			for(int i = 0;i < 10;i++) {
				a[i] = Integer.parseInt(reader.readLine());
				int t = a[i];
				int j = i;
				while(j > 0 && a[j-1] < t) {
					a[j] = a[j-1];
					j--;
				}
				a[j] = t;
			}
			for(int i = 0;i < 3;i++) {
				System.out.println(a[i]);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}