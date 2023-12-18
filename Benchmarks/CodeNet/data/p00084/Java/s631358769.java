import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] str = n.split("[,\\s.]");
		for(int i = 0; i < str.length; i++){
			if(2 < str[i].length() && str[i].length() < 7){
				System.out.println(str[i]);
			}
		}
	}
		 
}