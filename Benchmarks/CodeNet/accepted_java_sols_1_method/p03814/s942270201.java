import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int positionA = Integer.MAX_VALUE;// Aは出来るだけ文字列の先頭で見つけたい
        int positionZ = 0;// Zは出来るだけ文字の後ろで見つけたい
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                if (positionA > i) positionA = i;
            } else if (s.charAt(i) == 'Z') {
                if (positionZ < i) positionZ = i;
            }
        }

        System.out.println(positionZ-positionA+1);
    }
}
