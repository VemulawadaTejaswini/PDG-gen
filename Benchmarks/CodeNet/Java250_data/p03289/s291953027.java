import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] agrs) throws IOException{
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String input = bufferedReader.readLine();
		char[] inputArray = input.toCharArray();
		int lengthOfInput = input.length();
				
		char first = inputArray[0];
		boolean condition1 = (first == 'A');
		
		int numberOfC = 0;
		int cAt = 0;
		boolean condition2 = false;
		
		for (int a = 2; a <= lengthOfInput - 2; a++) {
			if(inputArray[a] == 'C') {
				
				if(numberOfC == 0) {
					condition2 = true;
					cAt = a;
					
					numberOfC++;
				}else {
					condition2 = false;
					break;
				}
			}
		}
		
		boolean condition3 = false;
		
		for(int a = 0; a < lengthOfInput; a++) {
			if(a != 0 && a != cAt) {
				condition3 = Character.isLowerCase(inputArray[a]);
				if(!condition3) {
					break;
				}
			}
		}
		
		if(condition1 && condition2 && condition3) {
			print("AC");
		}else {
			print("WA");
		}
	}
	
	public static void print(String string) {
		System.out.println(string);
	}
	
}
