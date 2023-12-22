import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<String> sList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sList.add(sc.nextLine());
        }
        System.out.println("AC x " + sList.stream().filter(s -> s.equals("AC")).count());
        System.out.println("WA x " + sList.stream().filter(s -> s.equals("WA")).count());
        System.out.println("TLE x " + sList.stream().filter(s -> s.equals("TLE")).count());
        System.out.println("RE x " + sList.stream().filter(s -> s.equals("RE")).count());
    }
}
