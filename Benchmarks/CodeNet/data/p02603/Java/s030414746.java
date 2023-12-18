import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int yen = 1000;
        int stock = 0;
        for(int i=0; i<n; i++){
            if(i != n-1){
                if(arr[i+1] <= arr[i]){
                    yen += stock*arr[i];
                    stock = 0;
                }else{
                    stock = yen/arr[i];
                    yen -= yen/arr[i] * arr[i];
                }
            }
            // System.out.println(yen+" "+stock);
        }
        yen += stock*arr[n-1];
        System.out.println(yen);
        sc.close();
    }
}