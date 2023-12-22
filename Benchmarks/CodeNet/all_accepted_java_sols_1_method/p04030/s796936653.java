import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> ss = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String tmp = s.substring(i, i + 1);
            if(tmp.equals("0")) {
                ss.add("0");
            } else if(tmp.equals("1")) {
                ss.add("1");
            } else if(tmp.equals("B")) {
                if(ss.size() != 0) {
                    ss.remove(ss.size() - 1);
                }
            }
        }
        for (String s1 : ss) {
            System.out.print(s1);
        }
    }
}
