import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ans = new StringBuilder();
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n-1; i++) A[Integer.parseInt(sc.next()) - 1]++;
        for(int a : A) ans.append(a).append("\n");
        System.out.print(ans);
    }
}
