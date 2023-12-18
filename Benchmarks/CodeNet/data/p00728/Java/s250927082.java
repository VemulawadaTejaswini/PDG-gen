import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve2440();
    }

    public static void solve2440() {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(0 == n){
                break;
            }
            int[] s = new int[n];
            int sum = 0;
            int max = 0;
            int min = 1000;
            int avg = 0;
            for(int i=0; i<n; i++){
                s[i] = sc.nextInt();
                if(s[i]>max){
                    max = s[i];
                }
                if(s[i]<min){
                    min = s[i];
                }
                sum += s[i];
            }
            sum -= (max + min);
            avg = sum /(n-2);
            System.out.println(avg);
        }
    }
}
