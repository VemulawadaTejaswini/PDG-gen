import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		String c=input.next();
		if(c.contentEquals("a")||c.contentEquals("i")||c.contentEquals("u")||c.contentEquals("e")||c.contentEquals("o")) {
			System.out.println("vowel");
		}else{
			System.out.println("consonant");
		}
	}
}