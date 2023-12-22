import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        long suma = 0, sumb = 0;
        for(int i=0; i<n; i++){
            if(a[i] > b[i]){
                sumb += a[i] - b[i];
            }else{
                suma += (b[i] - a[i]) / 2;
            }
        }
        if(suma >= sumb){
            System.out.println("Yes");        
        }else{
            System.out.println("No");
        }
    }
}