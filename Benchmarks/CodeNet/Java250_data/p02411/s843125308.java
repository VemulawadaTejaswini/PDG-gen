

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
		
		String[] input = br.readLine().split(" ");
		
		int tyuukan = Integer.parseInt(input[0]);
		int kimatu = Integer.parseInt(input[1]);
		int saisiken = Integer.parseInt(input[2]);
		int sum = tyuukan + kimatu;
		
		if(tyuukan == -1 && kimatu == -1 && saisiken == -1){
			break;
		}
		if(tyuukan == -1 || kimatu == -1){
			System.out.println("F");
		}else if(sum >= 80){
			System.out.println("A");
		}else if(65<=sum && sum <80){
			System.out.println("B");
		}else if(50<=sum && sum <65){
			System.out.println("C");
		}else if(30<=sum && sum <50){
			if(saisiken >= 50){
				System.out.println("C");
			}else{
				System.out.println("D");
			}
		}else if(30>sum){
			System.out.println("F");
		}else{
			System.out.println("F");
		}
		
		}
	}
	
}