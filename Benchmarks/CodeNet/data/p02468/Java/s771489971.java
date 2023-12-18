import java.util.Scanner; //繰り返し2乗法

public class Main {
	
	static int M = 1000000007;
    
    static long ans(long m,int n) {
        if(n==1) return m%M;
        else if(n%2==0) return ans(((m%M)*(m%M))%M,n/2);
        else  return (ans(((m%M)*(m%M))%M,n/2) * m%M)%M;
    }
    
    void main() {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextInt();
        int n =sc.nextInt();
        System.out.println(ans(m,n));
    }

    public static void main(String[] args) {
        new Main().main();
    }
}
