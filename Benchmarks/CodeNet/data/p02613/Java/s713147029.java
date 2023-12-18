// 提出時に消す


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> s = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            s.add(sc.next());
        }

        System.out.println("AC x " + s.stream().filter(e -> e.equals("AC")).count());
        System.out.println("WA x " + s.stream().filter(e -> e.equals("WA")).count());
        System.out.println("TLE x " + s.stream().filter(e -> e.equals("TLE")).count());
        System.out.println("RE x " + s.stream().filter(e -> e.equals("RE")).count());

        sc.close();
    }
}