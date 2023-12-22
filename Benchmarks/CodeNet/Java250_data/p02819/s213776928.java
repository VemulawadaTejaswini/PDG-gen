import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans=0;

        for(int i=X; i<(X*2); i++){
            if(IsPrime(X)){
                ans=X;
                break;
            }
            for(int j=2; j<=X; j++){
                if(i%j==0){
                    break;
                }
                if(j==X){
                    ans=i;
                    break;
                }
            }
            if(ans!=0){
                break;
            }
        }

        System.out.println(ans);
    }

    static boolean IsPrime(int n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n%2 == 0) return false;
        double sqrtNum = Math.sqrt(n);
        for (int i=3; i<=sqrtNum; i+=2) {
            if (n%i == 0) {return false;}
        }
        return true;
    }
}
