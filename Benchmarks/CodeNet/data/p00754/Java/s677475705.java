import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                String s = sc.nextLine();
                if (s.equals(".")) break;
                System.out.println(search(s, 0, '.', '.', 0) == s.length()-1 ? "yes" : "no");
            } catch (Exception e) {
                break;
            }
        }
        sc.close();
    }

    private static int search(String s, int i, char shape, char opp, int depth) {
        for (; i<s.length()-1; ++i) {
            char c = s.charAt(i);
            if (opp == '.') {
                if (c == ')' || c == ']') return s.length()+10;
            }
            if (c == opp) return s.length()+10;
            else if (c == '(') i = search(s, i+1, ')', ']', depth+1);
            else if (c == '[') i = search(s, i+1, ']', ')', depth+1);
            else if (c == shape) return i;
        }
        return i + depth;
    }
}

