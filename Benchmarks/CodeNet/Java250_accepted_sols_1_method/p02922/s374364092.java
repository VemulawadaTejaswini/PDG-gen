import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        int count = 1;
        while (count<b){
            count+=a-1;
            ans++;
        }
        System.out.println(ans);
    }
}
