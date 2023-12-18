import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] s = new int[N];
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            s[i] = sc.nextInt();
            list.add(s[i]);
            ans += s[i];
        }

        Collections.sort(list);
        
        if(ans%10!=0){
            System.out.println(ans);
        }
        else{
            for(int i=0; i<N; i++){
                if(list.get(i)%10!=0){
                    ans -= list.get(i);
                }
                if(ans%10!=0){
                    System.out.println(ans);
                    break;
                }
                if(i==N-1){
                    System.out.println(0);
                    break;
                }
            }
        }
    }
}