import java.util.Scanner;
class Main{
    int r;
    double A = 0,B = 0,C = 3.141592653589;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        if(r > 0){
        A = 1.0 * r * r * C;
        B = 1.0 * 2.0 * r * C;
        }
    }
    public void outputtt(){
        System.out.printf("%3.6f %3.6f %n",A,B);
    }
    public static void main(String[] args){
        new Main().solve();
        new Main().outputtt();

    }
}