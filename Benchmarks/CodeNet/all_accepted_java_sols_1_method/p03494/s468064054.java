import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean isContinue = true;
        int n = Integer.parseInt(sc.nextLine());
        String[] list = sc.nextLine().split(" ");
        sc.close();
        while (isContinue) {
            for (int i = 0; i < n; i++) {
                Integer val = Integer.parseInt(list[i]);
                if (val % 2 == 0) {
                    list[i] = String.valueOf(val / 2);
                } else {
                    isContinue = false;
                    break;
                }
            }
            if (isContinue) {
                count++;
            }
        }
        System.out.println(count);
    }
}