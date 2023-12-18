import java.util.Scanner;
class Main{
    int n,x,y,hozon;
    boolean b = false;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int [n];
        for(x = 0; x < n; x++){
            a[x] = sc.nextInt();
        }
        for(x = 0; x < n; x++){
            for(y = n-1; y > 0;y--){
                    if(a[y-1] < a[y]){
                        hozon = a[y];
                        a[y] = a[y-1];
                        a[y-1] = hozon;
                    }else{
                        continue;
                    }
            }
            System.out.printf(" %d",a[x]);
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}