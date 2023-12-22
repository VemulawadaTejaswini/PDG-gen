import java.util.*;

public class Main{
	public static void main(String[] args){
		String input = new Scanner(System.in).nextLine();
		String[] num = input.split("\\s");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		int c = Integer.parseInt(num[2]);
		if((a < b) && (b < c)){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}