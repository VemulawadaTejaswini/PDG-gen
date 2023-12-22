import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int ans = 0;
        int max = 0;
        int tmp = 0;
        for(int i = 0;i<n;i++){
            tmp = Integer.parseInt(sc.next());
            if(max <= tmp){
                ans++;
                max = tmp;
            }
        }
        System.out.println(ans);
    }
}