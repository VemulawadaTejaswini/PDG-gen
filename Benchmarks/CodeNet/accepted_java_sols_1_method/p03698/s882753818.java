import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        HashSet<Character> ss = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            ss.add(s[i]);
        }
        if(s.length == ss.size()) System.out.println("yes");
        else System.out.println("no");
    }
}