import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        Arrays.sort(line, Comparator.reverseOrder());
        int a = Integer.parseInt(line[0] + line[1]);
        int b = Integer.parseInt(line[2]);
        System.out.println(a + b);
    }
}
