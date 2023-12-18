//API???????????????
import java.io.IOException;
import java.util.Scanner;
class Main {
  	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		if(str1.length() < str2.length()) return;
		
		int n = str1.length() - str2.length() + 1;
		for(int i = 0; i < n; i++){
			if(str1.charAt(i) == str2.charAt(0)){
				if(str1.substring(i, str2.length()) == str2){
					System.out.println(i);
				}
			}
		}
		
		return;
	}
} 