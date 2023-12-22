import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double ans = 0;
        if(N%1000 == 0){
            ans = 0;
        }else{
            ans = (int)Math.ceil(N/1000)*1000-N;
        }
        
        System.out.println((int)ans);
    }
}
