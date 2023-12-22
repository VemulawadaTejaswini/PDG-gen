import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        int length = S.length;
    
    
        for (int i = 0; i < length; i++) {
            int n = (S[i] - 'A' + N) % 26;
            S[i] = (char) (n + 'A');
        }
    
        System.out.println((new String(S)));
    }
}