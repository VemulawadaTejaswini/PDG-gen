import java.util.*;
import java.util.regex.Pattern;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		//Pattern p = Pattern.compile("[,\\s]+");
		String[] str = n.split("[,\\s.]", -1);
		for(int i = 0; i < str.length; i++){
			if(2 < str[i].length() && str[i].length() < 7){
				System.out.println(str[i]);
			}
		}
	}
		 
}