import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sString = sc.next();

		ArrayList<Character> ans = new ArrayList<>();

		for(int i = 0; i<sString.length(); i++){
			if (ans.size() == 0){
				ans.add(sString.charAt(i));
			}else if (ans.get(ans.size()-1) != sString.charAt(i)){
				ans.remove(ans.size()-1);
			}else {
				ans.add(sString.charAt(i));
			}
		}
		System.out.println(sString.length() - ans.size());
	}
}
