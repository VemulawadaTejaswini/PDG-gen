//import java.util.InputMismatchException;
//import java.util.Scanner;
import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		//Scanner scan = new Scanner(System.in);
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String text = br.readLine();
		String[] word = text.split(" ", 0);
		int[] cun = new int[word.length];
		int max = 0;
		int maxA = 0;
		for(int i = 0 ; i < word.length ; i++){
			cun[i] = 0;
			for(int j = 0 ; j < word.length ; j++){
				if(i != j){
					if(word[i].equals(word[j])){
						cun[i]++;
					}
				}
			}
			if(max < cun[i]){
				max = cun[i];
				maxA = i;
			}
		}
		max = word[0].length();
		String maxT = word[0];
		for(int i = 1 ; i < word.length ; i++){
			if(max < word[i].length()){
				max = word[i].length();
				maxT = word[i];
			}
		}
		System.out.println(word[maxA] + " " + maxT);
	}
}