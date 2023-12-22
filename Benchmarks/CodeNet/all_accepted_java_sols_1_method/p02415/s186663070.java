import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		try{
			String str = br.readLine();
			for(int i=0;i<str.length();i++){
				if(Character.isUpperCase(str.charAt(i))){
					sb.append(str.toLowerCase().charAt(i));
				}else{
					sb.append(str.toUpperCase().charAt(i));
				}
			}
			System.out.println(sb);
		}catch(Exception e){
			System.err.println(e);
		}
	}
}