import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int ans = n1/n2;
        if(n1%n2>0){
            ans++;
        }
        System.out.println(ans);
    }
}
