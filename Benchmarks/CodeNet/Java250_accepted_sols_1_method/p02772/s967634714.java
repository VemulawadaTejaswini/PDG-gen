import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        int o = 0;
        int b = 0;

        for (int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int k=0; k<a.length; k++) {
            if (a[k] % 2 == 0){
                o++;
                if (a[k] % 3 == 0 || a[k] % 5 == 0) {
                b++;
                }
            }
        }

        if (o == b) {
            System.out.println("APPROVED");
        }
        else {
            System.out.println("DENIED");
        }
    }
}
