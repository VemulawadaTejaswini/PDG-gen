import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int taroScore = 0;
		int hanakoScore = 0;
		int number = Integer.parseInt(br.readLine());
		for(int i = 0;i < number;i++){
			String[] cardName = br.readLine().split(" ");
			if(cardName[0].compareTo(cardName[1]) > 0){
				taroScore += 3;
			}
			else if(cardName[0].compareTo(cardName[1]) == 0){
				taroScore += 1;
				hanakoScore += 1;
			}
			else{
				hanakoScore += 3;
			}
		}
		System.out.println(taroScore + " " + hanakoScore);
	}
}