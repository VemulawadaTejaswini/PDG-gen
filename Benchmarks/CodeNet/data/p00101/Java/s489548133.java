import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String Hoshina="Hoshina";
		String Hoshino="Hoshino";
		while(N--!=0){
			String ans="";
			String s = br.readLine();
			for(int i = 0; i < s.length();i++){
				//System.out.println(i);
				if(s.length()-i-1 >=Hoshino.length()-1 && Hoshino.equals(s.substring(i,i+Hoshino.length()))){
					ans+=Hoshina;
					i+=Hoshino.length()-1;
				}
				else{
					ans+=s.charAt(i);
				}
			}
			System.out.println(ans);
		}

	}
}