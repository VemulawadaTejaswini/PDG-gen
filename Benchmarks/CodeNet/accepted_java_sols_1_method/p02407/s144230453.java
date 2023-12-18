import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        List<String> ns = Arrays.stream(sc.nextLine().split(" "))
                                 .collect(Collectors.toList());
        Collections.reverse(ns);
        String s = ns.stream()
          .collect(Collectors.joining(" "));
        System.out.println(s);
    }
}

