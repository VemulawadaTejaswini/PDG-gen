import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int min = 0;
        int max = n;
        for(int i=0; i<m; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            min = Math.max(min, l);
            max = Math.min(max, r);
        }
        System.out.println(max-min>=0 ? max-min+1 : 0);
    }
}
