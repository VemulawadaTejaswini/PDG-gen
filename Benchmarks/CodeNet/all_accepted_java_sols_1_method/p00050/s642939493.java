import java.util.*;

public class Main
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String string = sc.nextLine();
			
			string = string.replaceAll("apple", "dammy1");
			string = string.replaceAll("peach", "dammy2");
			string = string.replaceAll("dammy1", "peach");
			string = string.replaceAll("dammy2", "apple");
			
			System.out.println(string);
		}
	}
}