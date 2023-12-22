import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ;i < a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int j = a.length - 1; j>=0 ; j--){
            System.out.print(a[j]);
            if(j == 0) break;
            System.out.print(" ");
        }
        System.out.println();
        sc.close();
    }
}
