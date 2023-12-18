import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String t = scan.nextLine();
		int count = 0;
		while( true ){
			String w = scan.nextLine();
			int i = 0;
			if( w.equals("END_OF_TEXT") ){
				break;
			}
			while( (i = w.indexOf(t, i)) != -1 ){
				count++;
				i += t.length();
			}
		}
		System.out.println(count);
		return;
	}
}