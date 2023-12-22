import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> h = new HashSet<>();
        for(int i = 0; i < n; i++) {
            h.add(sc.nextLine().trim());
        }
        System.out.println(h.size());
    }
}
