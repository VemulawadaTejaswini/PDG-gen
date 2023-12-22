import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String afterStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i + 1).toUpperCase().equals(str.substring(i, i + 1))) {
				afterStr+=str.substring(i, i + 1).toLowerCase();
			} else {
				afterStr+=str.substring(i, i + 1).toUpperCase();
			}
		}
		
		System.out.println(afterStr);
	}
}