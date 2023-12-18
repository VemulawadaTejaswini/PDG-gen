import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        for(int i = 0; i < c; ++i) {
            ArrayList<Integer> p = new ArrayList<Integer>();
            for(int j = 0; j < 3; ++j) {
                p.add(s.nextInt());
            }
            Collections.sort(p);
            System.out.println((p.get(0) > (p.get(1) + p.get(2)))?"YES":"NO");
        }
    }
}