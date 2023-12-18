
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	//
Scanner sc = new Scanner(System.in);
		//
		int count = 0;
	
		while(true){
			String input = sc.nextLine();
			String[] word = input.split(" ");
			//
			if(word[0].equals("END_OF_TEXT")){
				break;
			}
		//
		for(int i = 0; i < word.length; i++){
			word[i] = word[i].toLowerCase();
			
			if(word[i].equals(target)){
				count++;
			}
		}
	}
	System.out.println(count);
    }
}