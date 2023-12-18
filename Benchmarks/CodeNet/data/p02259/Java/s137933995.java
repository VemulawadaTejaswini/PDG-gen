import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        bubbleSort(a, n);
    }

    private static void bubbleSort(int[] a, int n) {
        int sum = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = n - 1; i > 0; i--) {
                if (a[i] < a[i - 1]) {
                    int emp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = emp;
                    sum++;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n-1]+"\n" + sum+"\n");
    }
}

