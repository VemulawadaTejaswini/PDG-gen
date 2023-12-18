import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digit_1 = N % 10;
        String read = "hon";
        Integer[] pon = {0, 1, 6, 8};
        List<Integer> ponNew = Arrays.asList(pon);

        if (digit_1 == 3) {
            read = "bon";
        } else if (ponNew.contains(digit_1)) {
            read = "pon";
        }
        System.out.println(read);

    }
}