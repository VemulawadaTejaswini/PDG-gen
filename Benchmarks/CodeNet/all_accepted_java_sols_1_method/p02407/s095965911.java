import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int n = sc.nextInt();
        a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }        
        for(int j=n-1;j>0;j--){
            System.out.print(a[j] + " ");
        }
        System.out.println(a[0]);
        sc.close();
    }
}
