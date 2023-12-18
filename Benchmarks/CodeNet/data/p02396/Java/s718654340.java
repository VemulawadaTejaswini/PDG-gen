import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10000];
        int j=0;
       while (true) {
        int x = sc.nextInt();
        if (x == 0 ) {
            break; 
        }
        a[j++] = x;
    }
    for (int i = 0; i<j; i++) {
            System.out.printf("Case %d: %d\n", i+1, a[i]);

} 
}
}
