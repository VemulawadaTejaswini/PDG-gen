import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        Integer[] red = new Integer[a];
        Integer[] green = new Integer[b];
        Integer[] noc = new Integer[c];

        for (int i = 0; i < a; i++) {
            red[i] = scan.nextInt();
        }

        for (int i = 0; i < b; i++) {
            green[i] = scan.nextInt();
        }

        for (int i = 0; i < c; i++) {
            noc[i] = scan.nextInt();
        }

        Arrays.sort(red, Collections.reverseOrder());
        Arrays.sort(green, Collections.reverseOrder());
        Arrays.sort(noc, Collections.reverseOrder());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < Math.min(x, a); i++) {
            result.add(red[i]);
        }

        for (int i = 0; i < Math.min(b, y); i++) {
            result.add(green[i]);
        }

        for (int i = 0; i < noc.length; i++) {
            result.add(noc[i]);
        }

        result.sort(Collections.reverseOrder());

        int t = x + y;
        long sum = 0;
        for (int i = 0; i < t; i++) {
            sum += result.get(i);
        }
        System.out.println(sum);
    }
}
