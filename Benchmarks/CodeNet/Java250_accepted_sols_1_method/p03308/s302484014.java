import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        long min = 1000000000;
        long max = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            if(Math.abs(a[i])>max) max = Math.abs(a[i]);
            if(Math.abs(a[i])<min) min = Math.abs(a[i]);
        }
        sc.close();
        System.out.println(max-min);
    }
}