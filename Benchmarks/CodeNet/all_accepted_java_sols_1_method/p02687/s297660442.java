import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 String word=sc.next();
		 if(word.equals("ABC"))
			 System.out.println("ARC");
		 else if(word.equals("ARC"))
			 System.out.println("ABC");
	     sc.close();
	 }
}
