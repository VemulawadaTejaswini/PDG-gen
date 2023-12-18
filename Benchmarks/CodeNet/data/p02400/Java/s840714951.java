import java.util.Scanner;
class Main{
    int r;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.printf("%8.6f %8.6f",(double)1.0*r*r*3.14,(double)2.0*r*3.14);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}