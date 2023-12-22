import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = (int) (Math.ceil((n-k)/(double)(k-1))+1);
        
        System.out.println(ans);
    }
}
