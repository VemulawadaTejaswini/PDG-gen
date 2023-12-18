import java.io.*;

class Main {
	private static final int NOT_ADD = -1;

	public static void main (String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
 
		try {
			if ((buf = br.readLine())!=null) {
				double max,min;
				max = min = Double.parseDouble(buf);
				while ((buf = br.readLine())!=null) {
					double d = Double.parseDouble(buf);
					if (max<d) max = d;
					if (min>d) min = d; 
				}
				System.out.println(max-min);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}