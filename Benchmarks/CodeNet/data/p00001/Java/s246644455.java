import java.util.Scanner;
public class Hills {
    public static void main(String[] a) {
        int highest[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            highest[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            int flag = 0;
            for (int j = 0; j < 10; j++) {
                if (highest[j]<highest[j + 1])) {
                    int tmp = highest[j];
                    highest[j] = highest[j + 1];
                    highest[j + 1] = tmp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int k = 0; k < 3; k++) {
            System.out.println(highest[k]);
        }
    }
}