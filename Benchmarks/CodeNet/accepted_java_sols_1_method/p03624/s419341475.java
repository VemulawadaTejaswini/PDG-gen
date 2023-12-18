
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> set = new HashSet<>();

        String ans = "None";
      String alp = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < alp.length(); i++) {
            String tmp =  String.valueOf(alp.charAt(i));

                if(s.contains(tmp)) {
                    continue;
                }
                ans=tmp;
               
                break;
        }
        System.out.println(ans);
    }
}