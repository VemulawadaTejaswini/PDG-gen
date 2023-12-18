
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        TreeSet set = new TreeSet<>();
        for (int i = 0; i < n; i++) set.add(sc.nextLine());
        System.out.println(set.size());
    }
}