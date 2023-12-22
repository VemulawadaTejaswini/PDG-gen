import java.util.*;
import java.lang.reflect.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character> str = new ArrayList<Character>();
        for(int i = 0; i < 4; ++i) {
            str.add(s.charAt(i));
        }
        Collections.sort(str);
        if(str.get(0) == str.get(1) && str.get(2) == str.get(3) && str.get(1) != str.get(2)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}