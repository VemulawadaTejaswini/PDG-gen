import java.util.Scanner;
class Main{
    int r;
    double A = 0.0;
    double B = 0.0;
    double C = 3.141592653589;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        int r1 = r * r;
        int r2 = 2 * r;
        A = (double)r1 * C;
        B = (double)r2 * C;
        System.out.printf("%3.6f %3.6f %n",A,B);    
    }

    public static void main(String[] args){
        new Main().solve();

    }
}