import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int l = sc.nextInt();
        
        int[] taste = new int[n];
        int min = 1000;
        int eat = 0;
        
        for(int i = 1; i <= n; i++){
            if(Math.abs(l + i - 1) < min){
                min = Math.abs(l + i - 1);
                eat = i - 1;
            }
            taste[i-1] = l + i -1;
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(i != eat){
                ans += taste[i];
            }
        }
        
        System.out.println(ans);
    }
}