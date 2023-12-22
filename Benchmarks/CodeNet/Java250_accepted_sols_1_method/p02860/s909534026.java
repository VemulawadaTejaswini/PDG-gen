import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String word = input.next();
		String firstHalf = "";
		String secondHalf = "";
		if (word.length()%2 == 0 && number == word.length()) {
			for(int i = 0; i<(number/2); i++) {
				firstHalf = firstHalf + word.charAt(i);
				secondHalf = secondHalf + word.charAt(i+(number/2));
			}
			if (firstHalf.equals(secondHalf)) {
				System.out.println("Yes"); 
			}else {
				System.out.println("No"); 
			}
		}else {
			System.out.println("No");   
		}
    	
    }
}
