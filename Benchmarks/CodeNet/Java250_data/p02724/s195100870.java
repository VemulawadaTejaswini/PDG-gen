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
        int yen500cnt = input/500;
        int div = input%500;
        int yen5cnt = div/5;
        System.out.println((yen500cnt*1000) + (yen5cnt*5));
    }

    public static void res(boolean flg) {
        if(flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
