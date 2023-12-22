import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int res = -1;
        char t = 'x';
        for(char c : S) {
            if(c == t) continue;
            t = c;
            res++;
        }
        System.out.println(res);
    }
}
