import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num < 400) {
                set.add("gray");
            } else if (num < 800) {
                set.add("brown");
            } else if (num < 1200) {
                set.add("green");
            } else if (num < 1600) {
                set.add("sky");
            } else if (num < 2000) {
                set.add("blue");
            } else if (num < 2400) {
                set.add("yellow");
            } else if (num < 2800) {
                set.add("orange");
            } else if (num < 3200) {
                set.add("red");
            } else {
                cnt++;
            }

        }

        sc.close();

        if (set.size() == 0) {
            System.out.println("1 " + cnt);
        } else {
            System.out.println(set.size() + " " + (set.size() + cnt));
        }
    }
}