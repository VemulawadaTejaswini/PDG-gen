import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        boolean che = false;
        for(int i = 0 ; i < n - 1 && che == false ; i++ ){
            if(a[i] == a[i + 1]){
                che = true;
            }
        }
        if(che == false){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}