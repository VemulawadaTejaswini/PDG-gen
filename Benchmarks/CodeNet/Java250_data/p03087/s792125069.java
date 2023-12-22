import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String b = sc.next();
        int[] count = new int[n+1];
        for (int i = 1;i < n;i ++) {
            int p = i+1;
            if (b.charAt(i-1) == 'A' && b.charAt(i) == 'C') {
                count[p] = count[p-1] + 1;
            } else {
                count[p] = count[p-1];
            }
            //System.out.println("ip="+p+", count="+count[p]);
        }

        for (int i = 0; i < q;i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(count[r]-count[l]);
        }
    }
}
