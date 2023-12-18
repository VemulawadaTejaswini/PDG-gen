import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		int count = 0;
		while(true) {
			 String t = scan.next();
			 
			 if(t.equals("END_OF_TEXT")) break;
			 
			 t = t.toLowerCase();
			 
			 if(t.equals(w)) count++;
	
		}
		System.out.println(count);
		
	}

}

