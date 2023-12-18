import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        long N = sc.nextLong()-1;

        List<Integer> list = new ArrayList<>();

        list.add(Long.valueOf(N%26).intValue());
        N /= 26;
        while (N > 0) {
            N -= 1;
            list.add(Long.valueOf(N%26).intValue());
            N /= 26;
        }

        Collections.reverse(list);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        list.stream().map(i -> alphabet[i]).forEach(System.out::print);
    }
}
