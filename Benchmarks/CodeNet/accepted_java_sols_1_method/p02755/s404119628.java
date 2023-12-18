import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1; i<10001; i++) {
            int aa = (int) (i * 0.08);
            int bb = (int) (i * 0.1);
            if(a == aa && b == bb) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}