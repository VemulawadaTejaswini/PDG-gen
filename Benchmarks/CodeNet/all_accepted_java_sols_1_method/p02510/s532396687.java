import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			try {
				String line = reader.readLine();
				if(line.charAt(0) == '-')
					break;

				int num = Integer.parseInt(reader.readLine());

				for(int i = 0; i < num; i++) {
					int j = Integer.parseInt(reader.readLine());
					String sub1 = line.substring(0, j);
					String sub2 = line.substring(j);
					line = sub2.concat(sub1);
//					System.out.println(line);
				}

				System.out.println(line);
			} catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}