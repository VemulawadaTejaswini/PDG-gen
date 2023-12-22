import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isAns = true;
        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (!isCheck(t, x, y))
                isAns = false;
        }
        
        System.out.println(isAns ? "Yes" : "No");
    }

    static boolean isCheck(int t, int x, int y) {
        int sumMove = Math.abs(x) + Math.abs(y);
        if (sumMove > t)
            return false;
        
        if (sumMove % 2 == t % 2)
            return true;
        else
            return false;
    }
}
