import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String[] SList = sc.next().split("");
        String[] TList = sc.next().split("");
        String r = "";
        for (int i = 0; i < N; i++) {
            r += SList[i];
            r += TList[i];
        }
        System.out.println(r);
    }
}