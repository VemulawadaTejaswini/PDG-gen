import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {		
		try {
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String ans = "Hoshina";
			String mis = "Hoshino";
			ArrayList<String> printStr = new ArrayList<String>();
			int i = Integer.parseInt(bf.readLine());
			while(i > 0){
				String str = bf.readLine();
				str = str.replaceAll(mis,ans);
				printStr.add(str);
				i--;
			}
			for(String str : printStr){
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}