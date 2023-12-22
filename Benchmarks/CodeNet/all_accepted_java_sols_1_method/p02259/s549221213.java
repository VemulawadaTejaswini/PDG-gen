import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0, time = 0, b = 0;
        boolean flag = true;
        size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        while (flag) {
            flag = false;
            for (int j = size - 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    b = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = b;
                    time++;
                    flag = true;
                }
            }
        }
        for (int k = 0; k < size; k++) {
            System.out.print(a[k]);
            if(k != (size-1))System.out.print(" ");
        }
        System.out.print("\n");
        System.out.println(time);


    }
}

