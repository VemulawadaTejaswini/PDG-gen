import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(s.nextLine());
        }
        Map<String, Long> map = list.stream().collect(groupingBy(identity(), counting()));
        long tmp = 0;
        for (Map.Entry<String, Long> e : map.entrySet()) {
            if (tmp < e.getValue()) {
                tmp = e.getValue();
            }
        }
        List<String> ret = new ArrayList<>();
        for (Map.Entry<String, Long> e : map.entrySet()) {
            if (tmp == e.getValue()) {
                ret.add(e.getKey());
            }
        }
        ret.stream().sorted(String::compareTo).peek(System.out::println).collect(Collectors.toList());
    }
}