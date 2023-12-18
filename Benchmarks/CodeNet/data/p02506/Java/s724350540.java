import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int count = 0;
		String w = input.next();
		
		while (true){
			String str = input.next();
			if (str.equals("END_OF_TEXT")) break;
			if (w.equals(str)) count++;
		}
		
		System.out.println(count);
	}
}