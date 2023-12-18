import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int c = 1; // because x>=1
        int d = 0;
        for(int i=0; i<n; i++) {
            int l = in.nextInt();
            d += l;
            if(d<=x) {
                c++;
            }
        }
        System.out.println(c);
    }
}
