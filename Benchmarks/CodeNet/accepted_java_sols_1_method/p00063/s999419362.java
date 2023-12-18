import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			int count = 0;
			while ((buf = br.readLine())!=null) {
				StringBuffer sb = new StringBuffer(buf);
				String str1 = buf;
				String str2 = sb.reverse().toString();
				if (str1.equals(str2)) count++;
			}
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}