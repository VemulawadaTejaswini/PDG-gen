import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = scanner.nextInt();
        int count = 0;
        while (count < n) {
            int num = scanner.nextInt();
            list.add(num);
            count++;
        }
        int max = -2147483648;
        int min = list.get(0);
        for (int i = 0; i < n - 1; i++) {
            min = Math.min(min, list.get(i));
            max = Math.max(max, list.get(i+1) - min);
        }
        System.out.println(max);
    }
}
