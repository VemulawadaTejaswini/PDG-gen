import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                return;
            }
            List<Integer> ns;
            try {
                ns = Stream.of(s.split(""))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
            } catch (NumberFormatException e) {
                System.out.println(e);
                return;
            }
            System.out.println(ns.stream().mapToInt(Integer::intValue).sum());
        }
    }
}


