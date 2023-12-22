import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isOK = true;
        int prev = 0;
        for(int i=0; i<n; i++) {
            int h = in.nextInt();
            isOK = isOK && (h >= prev);
            prev = Math.max(prev, h-1);
        }
        System.out.println(isOK ? "Yes" : "No");
    }
}
