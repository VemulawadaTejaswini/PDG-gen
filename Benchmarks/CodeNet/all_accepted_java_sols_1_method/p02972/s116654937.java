import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a_i = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a_i[i] = sc.nextInt();
        }
        int[] data = new int[n+1];
        int count = 0;
        for (int i = n; i >= 1; i--) {
            int sum = 0;
            for (int j = 2 * i; j <= n; j += i) {
                sum += data[j];
            }
            if (a_i[i] == 0) {
                if(sum % 2 == 0) {
                    data[i] = 0;
                } else {
                    data[i] = 1;
                    count++;
                }
            } else {
                if(sum % 2 == 0) {
                    data[i] = 1;
                    count++;
                } else {
                    data[i] = 0;
                }
            }
        }
        System.out.println(count);
        for(int i = 1; i <= n; i++) {
            if(data[i]==1) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}