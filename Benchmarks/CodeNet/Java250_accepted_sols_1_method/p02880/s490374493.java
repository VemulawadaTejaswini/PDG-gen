import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			String ans = "No";

			outer:
				for(int i = 1; i < 10; i++){
					for(int j = 1; j < 10; j++){
						if(n == i*j){
							ans = "Yes";
							break outer;
						}
					}
				}
			System.out.println(ans);
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println(e);	
		}
	}
}