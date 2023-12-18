import java.io.*;
 
class Main {
	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
 
		try {
			while ((buf = br.readLine())!=null) {
				int n = Integer.parseInt(buf);
				boolean list[] = new boolean[2*n+1];
				for (int i=2;i<=2*n;i++) list[i] = true;
				for (int i=2;i<=2*n;i++) {
					for (int j=2;i*j<=2*n;j++) {
						list[i*j] = false;
					}
				}
				for (int i=n;i>=2;i--) {
					if (list[i]) {
						System.out.print(i+" ");
						break;
					}
				}
				for (int i=n;i<=2*n;i++) {
					if (list[i]) {
						System.out.println(i);
						break;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}