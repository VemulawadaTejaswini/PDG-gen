import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String sb = new String();
			sb = br.readLine();
			for (int i=0;i<sb.length();i++){
				char c = sb.charAt(i);
				if(Character.isUpperCase(c)){
					c = Character.toLowerCase(c);
				} else if (Character.isLowerCase(c)){
					c = Character.toUpperCase(c);
				}
				System.out.print(c);
			}System.out.println();
		}catch(Exception e){}
	}
}