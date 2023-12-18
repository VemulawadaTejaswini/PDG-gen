import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.nextLine();
		
		String[] word;
		word = str.split(" ");
		int[] num = new int[word.length];
		String[] check = new String[word.length];
		int index = 0;
		int max = 0;
		int len = 0;
		String longword = new String();
		for(int i = 0; i < word.length; i++){
			if( word[i].length() > len ){
				len = word[i].length();
				longword = word[i];
			}
			for(int j = 0; j < index; j++){
				if( word[i].equals(check[j]) ){
					num[j]++;
					if( num[j] > max ){
						max = num[j];
					}
				}
			}
			check[index] = word[i];
			num[index]++;
			index++;
		}
		String mode = new String();
		for(int i = 0; i < index; i++){
			if( num[i] == max ){
				mode = check[i];
			}
		}
		System.out.println(mode + " " + longword);
	}
}