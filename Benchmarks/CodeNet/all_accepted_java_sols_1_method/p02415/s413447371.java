import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		// 入力導入部
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String strin=br.readLine();
		String[] str=strin.split("");
		
		
		
		for(int i=0;i<str.length;i++){
			if(str[i].equals(str[i].toLowerCase())){
				System.out.print(str[i].toUpperCase());
			}else System.out.print(str[i].toLowerCase());
		}br.close();
		System.out.println();
		}}