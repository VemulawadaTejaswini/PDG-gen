import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String Sa = scan.next();
        String Sb = scan.next();
        String Sc = scan.next();
        List<Character> list_a = new ArrayList<>();
        for(char i : Sa.toCharArray()) {
            list_a.add(i);
        }
        List<Character> list_b = new ArrayList<>();
        for(char i : Sb.toCharArray()) {
            list_b.add(i);
        }
        List<Character> list_c = new ArrayList<>();
        for(char i : Sc.toCharArray()) {
            list_c.add(i);
        }
        char turn = 'a';
        List<Character> current = list_a;
        while (!current.isEmpty()) {
            char x = current.remove(0);
            if (x == 'a') {
                turn = 'a';
                current = list_a;
            }
            if (x == 'b') {
                turn = 'b';
                current = list_b;
            }
            if (x == 'c') {
                turn = 'c';
                current = list_c;
            }
        }
        System.out.println((char) (turn-32));
    }
}
