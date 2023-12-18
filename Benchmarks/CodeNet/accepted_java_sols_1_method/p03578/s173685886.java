import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            if(map.containsKey(d)){
                map.put(d,map.get(d)+1);
            }else{
                map.put(d,1);
            }
        }
        int m = sc.nextInt();
        boolean bool = true;
        for(int i = 0; i < m; i++){
            int t = sc.nextInt();
            if(map.containsKey(t) && map.get(t) > 0){
                map.put(t,map.get(t)-1);
            }else{
                bool = false;
                break;
            }
        }
        System.out.println(bool ? "YES" : "NO");
    }
}
