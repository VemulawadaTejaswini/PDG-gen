import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ary = s.split("");
        List<String> sary = new ArrayList<>();
        for (int i = 0; i < ary.length; i++) {
            String a = ary[i];
            if (a.equals("0") || a.equals("1")) {
                sary.add(a);
            } else if (sary.size() != 0){
                sary.remove(sary.size() - 1);
            }
        }
        for (String ans: sary) {
            System.out.print(ans);
        }
    }
}