import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a;
        a = new int[n];
        int i;
        int sum = 0;
        for(i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for(i = 0; i < n; i++) {
            if(max < a[i]) {
                max = a[i];
            }
            if(min > a[i]) {
                min = a[i];
            }
            sum += a[i];
            }
            System.out.println(min + " " + max + " " + sum);
        }
    }

