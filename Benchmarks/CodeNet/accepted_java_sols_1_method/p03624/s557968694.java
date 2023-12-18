import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] C = abc.toCharArray();
        String ans = "None";
        for (char tar : C) {
            if(!S.contains(String.valueOf(tar))){
                ans = String.valueOf(tar);
                break;
            }
        }

        System.out.println(ans);
    }
}