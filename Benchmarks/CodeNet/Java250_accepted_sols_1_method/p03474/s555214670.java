import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(s);

        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (i == a) {
                if (s.charAt(i) != '-') {
                    flag = false;
                    break;
                }
            } else {
                try {
                    int n = Integer.parseInt("" + s.charAt(i));
                } catch (Exception e) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
