import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for(int i = 0; i < n; i++){
            ans *= sc.nextLong();
            
        }
        if(ans>(long)Math.pow(10, 18)){
            ans=-1;
        }
        System.out.println(ans);
    }
}