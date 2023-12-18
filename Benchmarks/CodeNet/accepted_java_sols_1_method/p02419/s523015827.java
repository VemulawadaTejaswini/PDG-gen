import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		String line1st = reader.readLine().toUpperCase();
		String line;
		String[] str;
		while(true) {
			line = reader.readLine();
			if(line.equals("END_OF_TEXT")) {
				break;
			}
			str = line.split(" ", -1);
			for(int i = 0; i < str.length; i++) {
				if(str[i].toUpperCase().equals(line1st)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}