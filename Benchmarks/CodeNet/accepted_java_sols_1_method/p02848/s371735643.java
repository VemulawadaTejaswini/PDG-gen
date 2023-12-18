import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int[] c = new int[S.length()];
        for(int i = 0; i < S.length(); i++){
            c[i] = S.charAt(i);
        }
        for(int i = 0; i < S.length(); i++){
            if(c[i] + N > 90) c[i] = c[i] + N - 90 + 64;
            else c[i] += N;
        }
        char[] a = new char[S.length()];
        for(int i = 0; i < S.length(); i++){
            a[i] = (char)c[i];
            System.out.print(a[i]);
        }
    }
}