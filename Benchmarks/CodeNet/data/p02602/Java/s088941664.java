import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n+1];
        arr[0] = 1;
        for(int i=1; i<n+1; i++){
            arr[i] = sc.nextInt()*arr[i-1];
        }
        for(int i=k; i<n; i++){
            long n1 = arr[i]/arr[i-k];
            long n2 = arr[i+1]/arr[i-k+1];
            // System.out.println(n1+" "+n2);
            if(n1 < n2)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }
}