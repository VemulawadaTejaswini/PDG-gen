import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long d = sc.nextInt();
        int ans = 0;
        for(int i = 0;i<n;i++){
            long x = sc.nextInt();
            long y = sc.nextInt();
            if((x*x+y*y)<=d*d){
                ans++;
            }
        }
        System.out.println(ans);
    }
    
}