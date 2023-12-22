import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int N = 0;

        for (int i = 0; i < s.length(); i++) {    //1文字ずつ足していく
            N += Integer.parseInt(s.substring(i, i + 1));
        }
        
        if (N % 9 == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
