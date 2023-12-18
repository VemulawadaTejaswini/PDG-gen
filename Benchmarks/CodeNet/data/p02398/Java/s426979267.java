import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(i = a; i <= b; i++) {
            int r = c % i;
            if(r == 0) {
                j++;
            }
        }
        System.out.println(j);
    }
}
