import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.next());
        int second = Integer.parseInt(scan.next());
        //int third = Integer.parseInt(scan.next());
        //String s = scan.next();
        //String second = scan.next();
        //for (int i = 1; i <=input; i++) {
        //}
        if(first>9 || second >9) {
            System.out.println(-1);
        } else {
            System.out.println(first*second);
        }
    }

}
