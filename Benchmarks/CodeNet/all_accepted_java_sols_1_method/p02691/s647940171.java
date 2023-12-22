import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =Integer.parseInt(sc.next());
        long[] l = new long[N];
        for(int i = 0 ;i < N ; i++){
            l[i] = Long.parseLong(sc.next());
        }
        Map<Long,Long> m = new HashMap<Long,Long>();
        long total = 0;
        for(int i = 0 ;i < N ; i++){
            if(m.containsKey(i+1-l[i])){
                total += m.get(i+1-l[i]);
            }
            if(m.containsKey(l[i]+1+i)){
                m.put(l[i]+1+i, m.get(l[i]+1+i)+1);
            }else{
                m.put(l[i]+1+i, 1l);
            }
        }
        System.out.println(total);
    }
}