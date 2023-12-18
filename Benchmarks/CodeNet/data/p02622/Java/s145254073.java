import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        String s = stdIn.next();
        String t = stdIn.next();
        char[] s1 = new char[200000];
        char[] s2 = new char[200000];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            s1[i] = s.charAt(i);
            s2[i] = t.charAt(i);
           if (s1[i] != s2[i]) {
               s1[i] = s2[i];
               count++;
           }
        }
        System.out.println(count);
    }
}