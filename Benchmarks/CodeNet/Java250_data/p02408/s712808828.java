import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1.????????????????????????
        List<String> list = new ArrayList<>();
        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 13; i++) {

                String s = "";
                if (j == 1) {
                    // System.out.println("??????S " + i);
                    s = "S ";

                } else if (j == 2) {
                    s = "H ";
//                    System.out.println("??¢???H " + i);
                }
                if (j == 3) {
                    s = "C ";
//                    System.out.println("?¢???±C " + i);
                }
                if (j == 4) {
                    s = "D ";
//                    System.out.println("??????D " + i);

                } else {
                    //   System.out.println("???????????????");
                }
                s = s + i;
                list.add(s);
            }

        }
        // 2. ???????????????????????????
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            // 3.????????????????????????
            if (list.contains(s)) {
                list.remove(s);
            }
        }

        // 4.???????????????????????????
        for (String str : list) {
            System.out.println(str);
        }
    }

}