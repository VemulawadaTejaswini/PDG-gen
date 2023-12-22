import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int[] c = new int[a];
        int max = 0;
        for(int i=0; i<a; i++) {
            b[i] = sc.nextInt();
        }
        for(int i=0; i<a; i++) {
            c[i] = sc.nextInt();
        }
        for(int i=0; i<a; i++) {
            int total = 0;
            for(int j=0; j<=i; j++) {
                total += b[j];
            }
            for(int k=i;k<a;k++) {
                total += c[k];
            }
            if(total > max) {
                max = total;
            }
        }
        System.out.println(max);
    }
}
