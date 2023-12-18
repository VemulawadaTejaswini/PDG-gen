import java.io.*;

public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			int i = 0;
			String num;
			int ans = 0;
			while(line != "0"){
				for(i = 0; i < line.length(); i++){
					num = String.valueOf(line.charAt(i));
					ans += Integer.parseInt(num);
				}
				System.out.println(ans);
				ans = 0;
				line = reader.readLine();
			}
		} catch (IOException e){
			System.out.println(e);
		}
	}
}