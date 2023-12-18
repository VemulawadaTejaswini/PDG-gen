import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int l = 0;
        int r = 0;

        int lmax = 0;
        int rmin = n;

        for (int i = 0; i < m; i++) {
            l = sc.nextInt();
            if (lmax < l) {
                lmax = l;
            }

            r = sc.nextInt();
            if (rmin > r) {
                rmin = r;
            }
        }

        if(rmin-lmax+1 >= 0){
            System.out.println(rmin-lmax+1);

        }else{
            System.out.println(0);
        }


        sc.close();
    }
}
