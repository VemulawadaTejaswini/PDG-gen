import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        new Main().run();
    }
    TreeSet<Integer> set;

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'B') {
                if(sb.length() > 0) sb.delete(sb.length()-1, sb.length());
            }else{
                sb.append(S.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

}