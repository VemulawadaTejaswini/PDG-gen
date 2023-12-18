import java.util.*;
 
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long x, res=1;
        int f=0;
        for(int i=0;i<n;i++) {
            x = sc.nextInt();
            if(x != 0) res *= x;
            else if(x == 0) {
                System.out.println(0);
                f=1; break;
            }
            if(res > Math.pow(10, 18)) {
                System.out.println(-1);
                f=1; break;
            }
        }
        if(f == 0)
            System.out.println(res);
    }
}