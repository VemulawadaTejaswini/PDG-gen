import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        long a,min =1000000, max =-1000000, sum = 0;
        for (i = 0; i < n; i++) {
            a = sc.nextLong();
            if (a < min) {
                min = a;
            }
            if (a > max) {
                max = a;
            }
            {sum += a;}
            }
        System.out.println(min + " " + max + " " + sum);
        sc.close();
    }
}
