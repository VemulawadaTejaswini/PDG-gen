import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        char[] d = Integer.toString(N).toCharArray();
        char last = d[d.length-1];
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "hon");
        map.put('4', "hon");
        map.put('5', "hon");
        map.put('7', "hon");
        map.put('9', "hon");
        map.put('0', "pon");
        map.put('1', "pon");
        map.put('6', "pon");
        map.put('8', "pon");
        map.put('3', "bon");

        System.out.println(map.get(last));
    }
}
