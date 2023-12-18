import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int a = sc.nextInt();
        List<String> list = new ArrayList<>();
        StringBuilder ss = new StringBuilder(s1);
        for(int i=0; i < a; i++) {
            String s2 = sc.next();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();
            switch(s2) {
            case "print":
                String s3 = ss.substring(b1, b2+1);
                list.add(s3);
                break;
            case "reverse":
                String ss1 = ss.substring(b1, b2+1);
                StringBuilder ss2 = new StringBuilder(ss1);
                ss2.reverse();
                ss = ss.replace(b1, b2+1, ss2.toString());
                break;
            case "replace":
                String b3 = sc.next();
                ss = ss.replace(b1, b2+1, b3);
                break;
            default:
                break;
            }
        }
        for(String s : list) {
            System.out.println(s);
        }
    }
}
