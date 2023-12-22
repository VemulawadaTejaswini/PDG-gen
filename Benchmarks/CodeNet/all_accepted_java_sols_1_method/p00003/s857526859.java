import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=0; i<x; i++) {
            int[] a = new int[3];
            a[0] = scanner.nextInt();
            a[1] = scanner.nextInt();
            a[2] = scanner.nextInt();
            Arrays.sort(a);
            if(a[0]*a[0] + a[1]*a[1] == a[2]*a[2]) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}