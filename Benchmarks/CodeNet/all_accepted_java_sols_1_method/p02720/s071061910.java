import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.close();

        List<Long> que = new ArrayList<>();
        for (long i = 1; i <= 9; i++) {
            que.add(i);
        }
        int count = 1;
        int head = 0;
        while (true) {
            long val = que.get(head);
            head++;
            long modVal = val % 10;
            long timeVal = val * 10;
            if (count == K) {
                System.out.println(val);
                break;
            }
            if (modVal != 0) {
                que.add(timeVal + modVal - 1);
            }
            que.add(timeVal + modVal);
            if (modVal != 9) {
                que.add(timeVal + modVal + 1);
            }
            count++;
        }
    }
}
