

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  sb = new StringBuilder(1200);
		try{
			String test =br.readLine();
			for(int i = 0;i<test.length();i++){
				
				if(Character.isLowerCase(test.charAt(i))){
					sb.append(Character.toUpperCase(test.charAt(i)));
				}
				else if(Character.isUpperCase(test.charAt(i))){
					sb.append(Character.toLowerCase(test.charAt(i)));
				}
				else{
					sb.append(test.charAt(i));
				}
			}
			
		}
		catch(IOException e){
			System.out.println("IOException :" + e);
		}
		
		System.out.println(sb);
		
	}
}

