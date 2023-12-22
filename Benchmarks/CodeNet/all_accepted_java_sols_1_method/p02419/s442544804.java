import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static String word=sc.next();
	private static int counter=0;
	public static void main (String[] args){
		while(true){
			String w=sc.next();
			if(w.equals("END_OF_TEXT")) break;
			if(w.equalsIgnoreCase(word)) counter++;
		}
		System.out.println(counter);
	}
}