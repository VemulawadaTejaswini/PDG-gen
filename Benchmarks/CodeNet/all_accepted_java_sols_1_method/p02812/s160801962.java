import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			line = reader.readLine();
			char s[] = line.toCharArray();
			
			int ans = 0;

			for(int i = 0; i < (n-2); i++){
				if(s[i] == 'A' && s[i+1] == 'B' && s[i+2] == 'C'){
					ans ++;
				}
			}
			System.out.println(ans);
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}