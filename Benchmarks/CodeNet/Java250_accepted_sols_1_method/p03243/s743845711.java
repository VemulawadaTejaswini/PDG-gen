import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            int n = in.nextInt();

            int[] a = new int[3];
            a[0] = n / 100;
            a[1] = n % 100;
            a[2] = a[1] % 10;
            a[1] = a[1] / 10;

            int m;
            if (a[0] == a[1] && a[0] == a[2]) {
                System.out.println(n);
            } else {
                if (a[0] < a[1]) {
                    m = a[0] + 1;
                } else if (a[0] > a[1]) {
                    m = a[0];
                } else {
                    if(a[0] > a[2]){
                        m = a[0];
                    }else{
                        m = a[0] + 1;
                    }
                }
                System.out.println(m * 100 + m * 10 + m);
            }
        }
    }
}