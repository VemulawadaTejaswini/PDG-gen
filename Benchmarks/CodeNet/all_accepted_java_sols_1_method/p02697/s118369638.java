import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isEven = n%2==0;
        int m = in.nextInt();
        int mid = (int)Math.floor(n/2.0);
        int quarter = (int)Math.floor(n/4.0);
        for(int i=0; i<m; i++) {
            int offset = (isEven && i>=quarter) ? 1 : 0;
            System.out.print(mid-i);
            System.out.print(' ');
            System.out.println(mid+1+i+offset);
        }
    }
}
