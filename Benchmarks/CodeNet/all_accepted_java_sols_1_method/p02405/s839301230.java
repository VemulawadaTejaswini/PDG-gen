import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0 && w == 0) {
                break;
            }
            int flag1 = 0, flag2 = 0;
            for (int i = 0; i < h; i++) {
                if (flag2 == 0) {
                    for (int j = 0; j < w; j++) {
                        if (flag1 == 0) {
                            System.out.printf("#");
                            flag1 = 1;
                        } else if (flag1 == 1) {
                            System.out.printf(".");
                            flag1 = 0;
                        }
                    }
                    System.out.println();
                    flag2 = 1;
                    flag1 = 1;
                    continue;
                } else if (flag2 == 1) {
                    for (int j = 0; j < w; j++) {
                        if (flag1 == 0) {
                            System.out.printf("#");
                            flag1 = 1;
                        } else if (flag1 == 1) {
                            System.out.printf(".");
                            flag1 = 0;
                        }
                    }
                    System.out.println();
                    flag2 = 0;
                    flag1 = 0;
                    continue;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
