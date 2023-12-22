import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<n; i++){
            int a = scan.nextInt();
            if(m.containsKey(a)){
                m.put(a, m.get(a)+1);
            }else{
                m.put(a, 1);
            }
        }

        int cnt = 0;
        for(int key : m.keySet()){
            while(key != m.get(key) && m.get(key) != 0){
                m.put(key, m.get(key)-1);
                cnt++;
            }
        }

        System.out.println(cnt);
        scan.close();
        
    }
}