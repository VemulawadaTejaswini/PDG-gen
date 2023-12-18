import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		int count = 0;
		while(scan.hasNext()){
			String text = scan.next();
			int out = 0;
			char character[] = text.toCharArray();
			for(int i = 0 ; i < (character.length)/2 ; i++){
				for(int j = character.length-1-i ; j > character.length-2-i ; j--){
					if(character[i] == character[j]){
						if(i == (character.length)/2-1){
							++count;
						}
					}else{
						out = 1;
						break;
					}
				}
				if(out == 1){
					break;
				}
			}
		}
		System.out.println(count);
	}
}