import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int c = 0;

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>i;j--){
                if(a[j-1]>a[j]){
                    int b = a[j-1];
                    a[j-1] = a[j];
                    a[j] = b;
                    c++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(i==n-1) System.out.println(a[i]);
            else System.out.print(a[i]+" ");
        }
        System.out.println(c);
        sc.close();
    }
}
