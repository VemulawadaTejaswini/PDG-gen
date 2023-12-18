import java.util.*;


public class Main {
    public static void main(String[] args){
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(count.containsKey(a)){
                count.put(a, count.get(a)+1);
            }else{
                count.put(a, 1);
            }
        }

        int ans = 0;
        for(Integer i : count.keySet()){
            if(i < count.get(i)){
                ans += count.get(i) - i;
            }else if(i > count.get(i)){
                ans += count.get(i);
            }
        }
        System.out.println(ans);
    }
}
