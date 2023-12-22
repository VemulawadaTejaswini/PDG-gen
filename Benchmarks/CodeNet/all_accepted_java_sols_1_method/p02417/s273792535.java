import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String linesum = "";
		while(in.hasNext()){
			String line = in.nextLine();
			linesum = linesum + line;
		}//?????°???????????¬????????????????????????
		char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] alphabet = new int[26];
		char[] word = new char[linesum.length()];
		for(int i = 0; i < 26; i++){
			alphabet[i] = 0;
		}
		for(int i = 0; i < linesum.length(); i++){
			word[i] = linesum.toLowerCase().charAt(i);
			for(int j = 0; j < 26; j++){
				if(word[i] == alpha[j]){
					alphabet[j]++;
				}
			}
		}
		for(int i = 0; i < 26; i++){
			System.out.println(alpha[i] + " : " + alphabet[i]);
		}
	}
}