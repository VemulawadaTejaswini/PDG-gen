import java.util.Scanner;
class Main{
    int n,x,y;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       
        for(x = 1; x <= n; x++){
            if(x % 3 == 0 || x % 10 == 3){
                System.out.printf(" %d",x);
            }else if(x / 10 == 3){
                System.out.printf(" %d",x);
            }else if(x / 130 == 1 && x % 130 <= 9 || x / 230 == 1 && x % 230 <= 9){
                System.out.printf(" %d",x);
            }

        }
        
        System.out.println();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}