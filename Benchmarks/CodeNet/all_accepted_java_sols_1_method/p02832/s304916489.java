import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++)
            num.add(sc.nextInt());
        int cnt = 0;
        int p=1;
        for(int i=0;i<n;i++){
            if(num.get(i)!=p){
                cnt++;
            }
            else{
                p++;
            }
        }
        if(p==1){
            System.out.println(-1); 
        }else{
        System.out.println(cnt);
        }
    }
}
