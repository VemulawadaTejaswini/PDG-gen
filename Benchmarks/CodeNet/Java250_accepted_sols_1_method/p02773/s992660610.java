import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Map<String, Integer> map = new TreeMap<>();
        int max = 0;
        for(int i = 0; i < n; i++){
            String s = sc.next();
            int a = map.getOrDefault(s, 0) +1;
            if(a > max) max = a;
            map.put(s, a);
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : map.keySet()) {
            if(map.get(s) == max){
                sb.append(s).append(System.lineSeparator());
            }
        }
        System.out.print(sb);
    }
}