import java.util.Scanner;
class Main {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int T = sc.nextInt();
        int ans;
        if(N%X != 0) {
            ans = (N/X + 1)*T;
        }else{
            ans = (N/X)*T;
        }
            
        System.out.println(ans);
    }
}