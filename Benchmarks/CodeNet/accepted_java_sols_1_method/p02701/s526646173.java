import java.util.*;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
 
class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        String[] S = new String[N];
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<N; i++){
            S[i] = sc.next();
            list.add(S[i]);
        }

        Collections.sort(list);
        int ans = 0;
        String a = "";
        for(int i=0; i<N; i++){
            if(!list.get(i).equals(a)){
                ans += 1;
                a = list.get(i);
            }
        }
        System.out.println(ans);
    }
}