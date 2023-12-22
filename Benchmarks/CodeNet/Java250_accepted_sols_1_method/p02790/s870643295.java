import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<String> list = new ArrayList<>();

        StringBuilder sba = new StringBuilder();
        for (int i=0; i < a; i++) {
            sba.append(b);
        }
        list.add(sba.toString());

        StringBuilder sbb = new StringBuilder();
        for (int i=0; i < b; i++) {
            sbb.append(a);
        }
        list.add(sbb.toString());

        list.sort(Comparator.naturalOrder());

        System.out.println(list.get(0));
    }
}
