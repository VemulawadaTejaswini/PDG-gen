import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int ans = 0;
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(sc.next());
            map.put(num, map.containsKey(num)?map.get(num)+1: 1);
        }
        long a=0l,b=0l;
        for(int i: map.keySet()){
            if(map.get(i)>1){
                if(map.get(i)<4){
                    if(a<=i){
                        b=a;
                        a=i;
                    }else if(b<i){
                        b = i;
                    }
                }else{
                    if(a<=i){
                        b=i;
                        a=i;
                    }else if(b<i){
                        b = i;
                    }
                }
            }
        }
        System.out.println(a*b);
    }
}
