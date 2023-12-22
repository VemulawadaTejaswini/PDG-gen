import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");

        int ab = Integer.parseInt(a[0]+a[1]);

        for(int i=2; i<ab; i++) {
            if(Math.pow(i,2) == ab) {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
        sc.close();
    }
}
