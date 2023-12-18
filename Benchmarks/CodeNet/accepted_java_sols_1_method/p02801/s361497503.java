import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String alpabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Character> list = new ArrayList<>(26);
        for (int i = 0; i < 26; i++) {
            list.add(alpabet.charAt(i));
        }
        System.out.println(list.get(list.indexOf(c) + 1));
        sc.close();
    }

}
