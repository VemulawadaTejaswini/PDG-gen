import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			line = reader.readLine();
			char[] s =line.toCharArray();
			String ans = "Yes";

			if(n%2 != 0){
				ans = "No";
			}else{
				for(int i = 0; i < n/2; i++) {
					if(s[i] != s[(n/2) + i]) {
						ans = "No";
					}
				}
			}
			System.out.println(ans);
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}