import java.util.Scanner;
class Main{
    int r;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.printf("%8.6f %8.6f",(double)r*r*3.141592653589,(double)r*2.0*3.141592653589);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}