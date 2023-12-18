import java.util.Scanner;

public class test {
    public static int valid(long x, long y,long z,long n){
        return (z*z+x*x+y*y+y*z+x*y+x*z==n?1:0);
    }
    public static int solve(int n){
        int ans=0;
        for (int x = 1; x*x+x*2 <= n ; x++) {
            for (int y = 1; y*y+x*y+x*x+x+y <= n ; y++) {
                for (int z = 1; z*z+x*x+y*y+y*z+x*y+x*z<= n ; z++) {
                    ans+= valid(x,y,z,n);
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.println(solve(i));
        }
    }
}
