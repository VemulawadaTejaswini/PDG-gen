import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> aSet = new HashSet<>();
        for(int i = 0; i < n; i++) aSet.add(Integer.parseInt(sc.next()));
        System.out.println(aSet.size() == n ? "YES" : "NO");
    }
}
