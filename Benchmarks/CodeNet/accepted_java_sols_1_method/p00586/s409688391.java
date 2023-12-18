import java.io.*;

public class Main {

	public static void main(String[] args) {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while((line=r.readLine())!=null){
				String[] vars = line.split(" ");
				int res = Integer.valueOf(vars[0]) + Integer.valueOf(vars[1]);
				System.out.println(res);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}