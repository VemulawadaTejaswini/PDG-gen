import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Xianda Xu on 2018/12/30.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map map = new HashMap<>();
        int N = scanner.nextInt();
        for(int i=0;i<N;i++){
            int key = scanner.nextInt();
            Integer o = (Integer)map.get(key);
            if(o==null){
                map.put(key,1);
            }else{
                map.put(key,o+1);
            }
        }
        int count=0;
        Set<Map.Entry> set = map.entrySet();
        for(Map.Entry entry : set){
            if((int)entry.getValue()%2==1){
                count++;
            }
        }
        System.out.println(count);
    }
}