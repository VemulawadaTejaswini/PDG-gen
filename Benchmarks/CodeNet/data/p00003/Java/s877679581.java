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
            System.out.println(((Math.pow(p.get(0), 2) + Math.pow(p.get(1), 2)) == Math.pow(p.get(2), 2))?"YES":"NO");
        }
    }
}