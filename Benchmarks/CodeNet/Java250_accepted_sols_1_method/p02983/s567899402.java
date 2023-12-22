import java.util.*;
class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int mod = 2019;
        int L = sc.nextInt();
        int R = sc.nextInt();
        int l = L%mod;
        int r = R%mod;
        int result = 2019;
        if(R-L>=mod){
            System.out.println(0);
            return;
        }
        if(l>r){
            System.out.println(0);
            return;
        }
        for(int i=l;i<=r;i++){
            for(int j=i+1;j<=r;j++){
                result = Math.min((i*j)%mod, result);
            }
        }
        result = result%mod;
        System.out.println(result);
    }
}