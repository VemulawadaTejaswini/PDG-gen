import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
        int max = 0;
        for(int i = 0; i < a; i++){
            String str = sc.next();
            if(hm.containsKey(str)){
                hm.put(str, hm.get(str) + 1);
            }else{
                hm.put(str, 1);
            }
            if(max < hm.get(str)){
                max = hm.get(str);
            }
        }
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            if(max == e.getValue()){
                System.out.println(e.getKey());
            }
        }
    }
}
