import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] chs = in.nextLine().toCharArray();
        String ans = "No";
        in.close();
        if ( (chs[0] == chs[1] && chs[2] == chs[3] && chs[0] != chs[2])
                || (chs[0] == chs[2] && chs[1] == chs[3] && chs[0] != chs[1])
                || (chs[0] == chs[3] && chs[1] == chs[2] && chs[0] != chs[1]) ) {
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
