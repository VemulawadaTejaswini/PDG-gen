import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);    
    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        long highest = 0, ans = 0;
        for (long a: arr){
            if (a < highest){
                ans += highest - a;
            }else{
                highest = a;
            }
        } 
        System.out.println(ans);
    }
}