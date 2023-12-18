import java.util.Scanner;
class Main{
    int r;
    public void solve(){
        double A,B;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        A = 1.0 * r * r * 3.141592653589;
        B = 1.0 * 2 * r * 3.141592653589;
        System.out.printf("%3.6f %3.6f",A,B);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}