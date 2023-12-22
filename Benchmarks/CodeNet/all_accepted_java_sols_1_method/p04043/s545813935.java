import java.util.*;

public class Main {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                try {
                        int c5 = 0;
                        int c7 = 0;
                        for (int i = 0; i<3; i++ ) {
                                int input = sc.nextInt();
                                if (input == 5) {
                                        c5++;
                                } else if (input ==7) {
                                        c7++;
                                }
                        }
                        if (c5 == 2 && c7 == 1) {
                                System.out.println("YES");
                        } else {
                                System.out.println("NO");
                        }

                } catch (Exception e) {
                //      e.printStackTrace();
                        System.out.println("入力値が不正です");
                }
        }
}