import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int a[] = new int[n];
        /*input*/
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        /*sort*/
        for(int i=0; i<n-1; i++){
            for(int j=n-1; j>0; j--){
                if(a[j]<a[j-1]){
                    int swap = a[j];
                    a[j] = a[j-1];
                    a[j-1] = swap;
                    cnt++;
                }
            }
        }
        /*output*/
        for(int i=0; i<n-1; i++) System.out.printf("%d ", a[i]);
        System.out.println(a[n-1]);
        System.out.println(cnt);
    }
}
