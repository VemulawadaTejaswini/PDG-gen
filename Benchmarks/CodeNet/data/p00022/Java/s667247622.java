import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] input;
    public static void main(String[] args) {
        while(read()){
            solve();
        }
    }
    static boolean read(){
        n = sc.nextInt();
        if(n == 0)return false;

        input = new int[n];
        for(int i = 0; i < n; i++)input[i] = sc.nextInt();

        return true;
    }
    static void solve(){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = input[i];
            for(int j = i+1; j < n; j++){
                sum +=  input[j];
                max = Math.max(sum, max);
            }
            sum = 0;
        }
        System.out.println(max);
    }
}