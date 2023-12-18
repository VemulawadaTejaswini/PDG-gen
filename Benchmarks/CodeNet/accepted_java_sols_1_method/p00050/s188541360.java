
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine()+"           ";
		//char[] s = ss.toCharArray();
		for(int i = 0;i<s.length()-5;i++){
			if(s.substring(i,i+5).equals("peach")){
				String tmp="";
				tmp+=s.substring(0,i);
				tmp+="apple";
				tmp+=s.substring(i+5,s.length());
				s=tmp;
			}
			else if(s.substring(i,i+5).equals("apple")){
				String tmp="";
				tmp+=s.substring(0,i);
				tmp+="peach";
				tmp+=s.substring(i+5,s.length());
				s=tmp;
				
			}
		}
		System.out.println(s.trim());

	}

}