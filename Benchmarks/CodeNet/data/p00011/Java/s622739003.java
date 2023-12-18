import java.util.Scanner;

public class Main{
    public static void swap(int[] a, int n, int m){
        int temp = a[n];
        a[n] = a[m];
        a[m] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] sum = new int[w];
        for(int i=0; i<w; i++){
            sum[i] = i+1;
        }
        for(int i=0; i<n; i++){
            String[] s = sc.next().split(",");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            swap(sum, a-1, b-1);
        }

        for(int i=0; i<w; i++){
            System.out.println(sum[i]);
        }
    }
}
