import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        sc.close();

        List<Integer> ans = new ArrayList<>();
        for (int i = x - k + 1; i < x + k; i++) {
            ans.add(i);
        }
        String result = ans.stream().map(e -> e.toString()).collect(Collectors.joining(" "));
        System.out.println(result);
    }

}
