import java.io.*;
 
class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		int n[] = new int[11];
		int i = 0;

		try {
			while ((buf = br.readLine())!=null) {
				n[i] = Integer.parseInt(buf);
				if (n[i]==0) {
					System.out.println(n[i-1]);
					i--;
				}
				else i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}