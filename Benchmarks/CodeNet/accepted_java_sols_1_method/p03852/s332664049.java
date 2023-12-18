import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		CharSequence c=reader.next();
		String voyel="aeiou";
		if (voyel.contains(c)){
			System.out.print("vowel");
		}
		else {
			System.out.print("consonant");

		}
		
	}
	
	

}
