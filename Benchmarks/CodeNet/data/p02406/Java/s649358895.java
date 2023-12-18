import java.util.Scanner;
class Main{
    int n,x,y;
    boolean z;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(x = 3; x <= n; x++){
            y = x;
            z = false;

                if(y % 3 == 0){
                    System.out.printf(" %d",x);
                    z = true;
                }else{
                    while(z == false){
                        if(y % 10 == 3){
                            System.out.printf(" %d",x);
                            z = true;
                        }
                        y /= 10;
                        if(y < 3){
                            z = true;
                        }
                    }   
                }
        }
        System.out.println();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}