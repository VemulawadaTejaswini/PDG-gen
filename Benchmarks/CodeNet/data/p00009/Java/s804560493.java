import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s;
			int count = 0, i, j;
			while((s = reader.readLine()) != null) {
				int n = Integer.parseInt(s);
				for(i = 2;i <= n;i++) {
					for(j = 2;j*j <= i;j++) {
						if(i % j == 0)
							break;
					}
					if(j*j > i)
						count++;
				}
				System.out.println(count);
				count = 0;
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}