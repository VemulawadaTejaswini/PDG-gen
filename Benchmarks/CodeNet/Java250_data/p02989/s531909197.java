import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        if(list.get(N/2)!=list.get(N/2-1)){
            for(int i=list.get(N/2-1)+1; i<=list.get(N/2); i++){
                ans += 1;
            }
            System.out.println(ans);
        }
        else{
            System.out.println(0);
        }
    }
}