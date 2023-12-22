import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.next());
        //int second = Integer.parseInt(scan.next());
        //long in = Long.parseLong(scan.next());
        //String s = scan.next();
        //String second = scan.next();
        //for (int i = 1; i <=input; i++) {
        //}
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=9;j++) {
                if(input == (i*j)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    public static void res(boolean flg) {
        if(flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
