import java.io.*;
class Main {
	public static void main (String[] args) {
			int sum = 0;
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
				while (true) {
					sum = 0;
					String line = reader.readLine();
					if (line.charAt(0) == '0') break;
					for(int i = 0; i < line.length(); i++) {
						char ch = line.charAt(i);
						sum += Character.getNumericValue(ch);
					}
					System.out.println(sum);
					
				}
			} catch (IOException e) {
				System.out.println(e);
			}
	}
}