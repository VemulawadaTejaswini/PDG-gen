import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String s;
			s = reader.readLine();
			for(int i = s.length()-1;i >=0;i--) {
				System.out.print(s.charAt(i));
			}
			System.out.println("");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}