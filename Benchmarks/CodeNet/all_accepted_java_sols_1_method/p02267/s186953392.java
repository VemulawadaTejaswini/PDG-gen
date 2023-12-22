import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> S = new ArrayList<Integer>();
        int n = sc.nextInt();
        
        for(int i = 0;i<n;i++ ){
            S.add(sc.nextInt());
        }
        int cnt = 0;
        int q = sc.nextInt();
        for(int i = 0;i<q;i++ ){
            int num = sc.nextInt();
            if(S.contains(num))cnt++;
        }
        System.out.println(cnt);
        
    }
}
