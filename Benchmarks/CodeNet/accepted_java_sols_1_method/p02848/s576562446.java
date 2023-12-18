import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        char[] C = S.toCharArray();
        for(char c1 : C) {
            int code = (int)c1;
            int code1 = code + N;
            int code2 = 0;
            if (code1 >= 91) {
                code2 = 65 + ((code1 - 65) % 26);
            }
            else {
                code2 = code1;
            }
            char c2 = (char)code2;
            System.out.print(c2);
        }
    }
}