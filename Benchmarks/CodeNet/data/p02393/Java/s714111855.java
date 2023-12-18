import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        //Input 
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = a.length - 1; j > i; j--) {

                // 上の方が大きいときは互いに入れ替えます
                if (a[j] < a[j - 1]) {
                    int t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1)
                System.out.print(" ");
        }
System.out.println("");
    }
}

