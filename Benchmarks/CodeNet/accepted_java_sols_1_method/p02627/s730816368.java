import java.util.*;

public class Main{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		String output = sc.next();
		char validate = output.charAt(0);

		if(Character.isUpperCase(validate)){
			output = "A";
		}else {
			output ="a";
		}
		
		System.out.println(output);
	}
}