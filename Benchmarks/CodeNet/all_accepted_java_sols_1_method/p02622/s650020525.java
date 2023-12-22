import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        char[] s = sc.nextLine().toCharArray();
        char[] t = sc.nextLine().toCharArray();

        int cnt = 0;
        for(int i=0; i<s.length; i++) {
            if(s[i] != t[i]) cnt++;
        }
        System.out.println(cnt);
    }
}
