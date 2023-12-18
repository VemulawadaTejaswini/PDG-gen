import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        Set<String> set = new HashSet<>();
        for(int i = 1; i <= Math.min(5, s.length()); i++) {
            for(int j = 0; j <= s.length() - i; j++) {
                set.add(s.substring(j, j + i));
            }
        }
        List<String> list = set.stream().sorted().collect(Collectors.toList());
        System.out.println(list.get(k - 1));
    }
}