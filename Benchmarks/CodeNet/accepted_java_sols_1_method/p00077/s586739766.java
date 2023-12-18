import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		while(scan.hasNext()){
			String N = scan.next();
			int repeat;
			String result = "";
			String character;
			char text[] = N.toCharArray();
			for(int i = 0 ; i < text.length ; i++){
				if(text[i] == '@'){
					repeat = Integer.parseInt(String.valueOf(text[i+1]));
					character = String.valueOf(text[i+2]);
					i += 2;
					for(int j = 0 ; j < repeat ; j++){
						result += character;
					}
				}else{
					result += String.valueOf(text[i]);
				}
			}
			System.out.println(result);
		}
	}
}