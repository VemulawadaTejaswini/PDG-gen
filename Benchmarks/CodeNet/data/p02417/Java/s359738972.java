import java.io.*;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		String str = "";
		String check="";
		int[] alph = new int[26];
		while((str=scan.nextLine()).length()!=0){
			for(int j=0;j<str.length();j++){
				check =String.valueOf(str.charAt(j));	
				if(check.matches("[a-z]+")){
					alph[str.charAt(j)-'a']++;
				}else if(check.matches("[A-Z]+")){
					alph[str.charAt(j)-'A']++;
				}
			}
		}
		for(int i=97;i<123;i++)
			System.out.println((char)i+" : "+alph[i-97]);
	}
}