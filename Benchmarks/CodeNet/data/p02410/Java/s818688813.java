import java.util.Scanner;
class Main{
    int n,m,x;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\s");
        n = sc.nextInt();
        m = sc.nextInt();
        int [] A = new int[n];
        for(x = 0; x < n; x++){
            A[x] = 0;
            for(int y = 0; y < m; y++){
                int a = sc.nextInt();
                A[x] += a;
            }
        }
        for(x = 0; x < m; x++){
            int b = sc.nextInt();
            if(b != 0){
                A[x] += b;
            }else{
                continue;
            }
        }
        for(x = 0; x < n; x++){
            System.out.println(A[x]);
        }
    }
    public static void main(String[] args){
        new Main().solve();
    }
}