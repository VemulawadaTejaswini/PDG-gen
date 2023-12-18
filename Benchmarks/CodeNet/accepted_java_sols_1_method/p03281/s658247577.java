import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int count = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if((i+1)%(j+1) == 0) count++;
            }
            if(count == 8 && !((i+1)%2 == 0))ans++;
            count = 0;
        }
        System.out.println(ans);
    }
}