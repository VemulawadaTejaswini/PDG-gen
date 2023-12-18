import java.util.Scanner;
class Main{
    int n,x;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(x = 1; x <= n; x++){
            if(x % 3 == 0 || x % 10 == 3){
                System.out.printf(" %d",x);
            }else{
                continue;
            }
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}