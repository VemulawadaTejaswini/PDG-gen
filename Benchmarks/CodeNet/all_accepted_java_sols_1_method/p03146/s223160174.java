import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int s = scan.nextInt();
        int index = 1;
        HashSet<Integer> set = new HashSet<>();
        set.add(s);
        while(true) {
            index += 1;
            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
            if (set.contains(s)) {
                break;
            }
            set.add(s);
        }
        System.out.println(index);
    }
}
