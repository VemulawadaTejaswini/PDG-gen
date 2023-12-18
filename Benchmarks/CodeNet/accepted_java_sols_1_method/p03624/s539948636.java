
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
        
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}

        String ans = "None";
        for (char i = 'a'; i <= 'z'; i++) {
			if (list.contains(i)) {
				continue;
			} else {
				ans = String.valueOf(i);
				break;
			}
		}
        
        System.out.println(ans);
    }
}