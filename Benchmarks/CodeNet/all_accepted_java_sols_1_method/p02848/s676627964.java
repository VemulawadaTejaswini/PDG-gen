import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] S = sc.next().toCharArray();
        char[] AL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        for(int i = 0; i < S.length; i++) S[i] = (char)(AL[(S[i] - 'A' + n) % AL.length]);
        System.out.println(S);
    }
}
