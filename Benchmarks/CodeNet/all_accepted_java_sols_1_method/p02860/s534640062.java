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
				if(!(line.substring(0, n/2).equals(line.substring(n/2, n)))){
					ans = "No";
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