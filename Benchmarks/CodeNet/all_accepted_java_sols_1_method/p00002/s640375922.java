import java.io.*;

public class Main{
	public static void main(String[] argv) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine()) != null){
			String[] splited = line.split(" ");
			int value = Integer.parseInt(splited[0]) + Integer.parseInt(splited[1]);
			System.out.print(Integer.toString(value).length() + "\n");
		}
		br.close();
	}
}