import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cards = scan.nextInt();

            String[] a = new String[cards];
            String[] b = new String[cards];

        String aa;
        String bb;

        int taro = 0;
        int hanako = 0;

        for (int i = 0; i < cards; i++) {
//            a[i] = scan.next();
            aa = scan.next();
//            System.out.println(aa.charAt(0));
//            b[i] = scan.next();
            bb = scan.next();
//            System.out.println(bb.charAt(0));
            aa = aa.toLowerCase();
            bb = bb.toLowerCase();

            char cc = 'z';
            int j = 26;
             do {
//                System.out.println(cc);
                 if (aa.charAt(0) == cc && bb.charAt(0) == cc) {
                     taro += 1;
                     hanako += 1;
//                     System.out.println("draw");
                     break;
                 } else if (aa.charAt(0) == cc) {
                    taro += 3;
//                    System.out.println("taro");
                    break;
                } else if (bb.charAt(0) == cc) {
                    hanako += 3;
//                    System.out.println("hanako");
                    break;
                }
//                 System.out.println(j);
                 cc--;
                 j--;
            } while (j > 0);
        }
        System.out.println(taro + " " + hanako);
    }
}