import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Double> list = IntStream.range(0, n).mapToDouble(i -> (double) sc.nextInt()).sorted().boxed().collect(Collectors.toList());
        while (list.size() > 1) {
            double x = (list.get(0) + list.get(1)) / 2;
            list.remove(0);
            list.remove(0);
            int size = list.size();
            if (size == 0) {
                list.add(x);
            } else {
                for (int i = 0; i < size; i++) {
                    if (x >= list.get(i)) {
                        list.add(i, x);
                        break;
                    }
                }
                if (size == list.size()) {
                    list.add(0, x);
                }
            }
        }
        System.out.println(list.get(0));
    }

}
