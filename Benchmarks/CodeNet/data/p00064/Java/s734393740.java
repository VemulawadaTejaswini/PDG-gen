import java.io.*;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			int sum = 0;
			String index = "0123456789";
			while ((buf = br.readLine())!=null) {
				for (int i=0;i<buf.length();i++) {
					String str = "";
					while (index.indexOf(buf.charAt(i))!=-1) {
						str = str+buf.charAt(i++);
					}
					if (!str.equals("")) sum += Integer.parseInt(str);
				}
			}
			System.out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}