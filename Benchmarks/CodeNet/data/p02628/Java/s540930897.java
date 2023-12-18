import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),c = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++)list.add(sc.nextInt());
        list = list.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        for (int i = 0; i < b; i++) c += list.get(i);
        System.out.println(c);
    }
}
