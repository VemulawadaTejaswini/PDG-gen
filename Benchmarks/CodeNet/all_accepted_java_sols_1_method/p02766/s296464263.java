import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        while(num>0){
            num = num / k;
            ans++;
        }
        
        System.out.println(ans);
    }
}