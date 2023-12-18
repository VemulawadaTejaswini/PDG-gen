import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		System.out.println(replace(str, "peach", "apple"));
	}
	
	static List<Integer> find(String str, String find) {
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i <= str.length() - find.length(); i++) {
			if(str.substring(i, i + find.length()).equals(find)) result.add(i);
		}
		return result;
	}
	
	static String replace(String original, String s1, String s2) {
		StringBuilder result = new StringBuilder(original);
		List<Integer> peach = find(original, s1);
		List<Integer> apple = find(original, s2);
		for(int i: peach) result.replace(i, i + s1.length(), s2);
		for(int i: apple) result.replace(i, i + s2.length(), s1);
		return result.toString();
	}
}