import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0 ; i < n ; i++){
            b[i] = a[i];
        }
        Arrays.sort(b);
        int aa = 0;
        for(int i = 0 ; i < n && aa == 0 ; i++){
            if(b[n - 1] == a[i]){
                aa = i;
            }
        }
        for(int i = 0 ; i < n ; i++ ){
            if(i == aa ){
                System.out.println(b[n - 2]);
            }else{
                System.out.println(b[n - 1]);
            }
        }
    }
}