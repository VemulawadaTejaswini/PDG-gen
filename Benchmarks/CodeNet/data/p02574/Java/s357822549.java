
import java.util.Scanner;

/**
 * Created by enpingkuang on 2020/9/11 11:31 下午
 */
public class Main {
    private static int[] prime = new int[1000001];
    private static int[] primeArray = new int[1000005];
    private static int primeNumber = 0;
    private static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

    private static void getPrime(){
        for(int i = 2;i<=1000000;i++){
            if(prime[i] == 1){
                continue;
            }
            primeArray[primeNumber++] = i;
            for(int j = 2;j*i<=1000000;j++){
                prime[j*i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        getPrime();
        boolean[] vis = new boolean[1000001];
        boolean first = true;
        boolean second = false;
        int tmp_gcd = -1;
        for(int i = 0;i<n;i++){
            int x = scanner.nextInt();
            first = resolve(first,x,vis);
            if(tmp_gcd == -1){
                tmp_gcd = x;
            }else{
                tmp_gcd = gcd(tmp_gcd,x);
            }
            if(tmp_gcd == 1){
                second = true;
            }
        }
        if(first){
            System.out.println("pairwise coprime");
        }else{
            if(second){
                System.out.println("setwise coprime");
            }else{
                System.out.println("not coprime");
            }
        }
    }

    private static boolean resolve(boolean flag,int x,boolean[] vis){
        if(!flag){
            return false;
        }
        int tmp = x;
        while (tmp != 1) {
            for (int i = 0; i < primeNumber; i++) {
                if(primeArray[i] > tmp){
                    break;
                }
                if(tmp % primeArray[i] == 0){
                    if(vis[primeArray[i]]){
                        return false;
                    }
                    vis[primeArray[i]] = true;
                    while(tmp % primeArray[i] == 0){
                        tmp /= primeArray[i];
                    }
                    break;
                }

            }
        }
        return true;
    }
}
