import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int[] num = new int[n+1];
            for(int i=0; i<n; i++) num[i] = sc.nextInt();
            num[n] = -1; 

            int first = num[0], last = num[0];
            for(int i=1; i<=n; i++){
                if(last+1==num[i]){
                    last = num[i];
                }else{
                    if(first!=last){
                        System.out.print(first+"-"+last);
                    }else{
                        System.out.print(first);
                    }
                    if(i!=n) System.out.print(" ");
                    first = num[i]; last = num[i];
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}