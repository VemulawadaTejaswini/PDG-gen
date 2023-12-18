import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 String vowels = "aeiou";
	        Scanner scan = new Scanner(System.in);
	        String letter = scan.next();
	        if(vowels.contains(letter)) {
	            System.out.println("vowel");
	        }else{
	            System.out.println("consonant");
	        }
		}

	}


