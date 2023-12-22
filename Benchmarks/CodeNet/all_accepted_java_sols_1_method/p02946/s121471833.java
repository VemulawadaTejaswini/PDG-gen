import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder ans = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int l = x - k + 1, r = x + k - 1;
        for(int i = l; i <= r; i++) ans.append(i + (i == r ? "" : " "));
        System.out.println(ans);
    }
}
