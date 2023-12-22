import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String c = sc.next();
        int leftp = 0;
        int rightp = n-1;
        int ans=0;
        while (true) {
            while (c.charAt(leftp) == 'R') {
                leftp++;
                if (leftp == rightp) {
                    System.out.println(ans);
                    return;
                }
            }
            while (c.charAt(rightp) == 'W') {
                rightp--;
                if (leftp == rightp) {
                    System.out.println(ans);
                    return;
                }
            }
            ans++;
            leftp++;
            rightp--;
            if (leftp >= rightp) {
                System.out.println(ans);
                return;
            }
        }
    }
}
