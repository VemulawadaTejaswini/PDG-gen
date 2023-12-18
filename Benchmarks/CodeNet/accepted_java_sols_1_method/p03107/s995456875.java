import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(i + 1)) {
                list.remove(i);
                list.remove(i);
                if (i == 0) {
                    i--;
                } else {
                    i -= 2; 
                }
            }
        }
        System.out.println(s.length() - list.size());
        sc.close();
    }
}