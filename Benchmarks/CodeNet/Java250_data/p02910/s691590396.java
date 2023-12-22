import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        List<Character> l = new ArrayList<>();
        char r='R';
        char ll='L';
        for (int i = 0; i < str.length(); i++) {
            l.add(str.charAt(i));
        }
        
        for (int i = 1; i <str.length(); i += 2) {
            if (l.get(i).equals(r)) {
                System.out.print("No");
                System.exit(0);
            }
        }
        for (int i = 0; i < str.length(); i += 2) {
            if (l.get(i).equals(ll)) {
                System.out.print("No");
                System.exit(0);
            }
        }
        System.out.print("Yes");

    }
}
