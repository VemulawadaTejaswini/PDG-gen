import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        
        Map<String,Boolean>map=new HashMap<String,Boolean>();
        for (int i = 0; i < N; i++) {
            map.put(sc.next(), false);
        }
        int M =sc.nextInt();
        for (int i = 0; i < M; i++) {
            String s = sc.next();
            if(map.containsKey(s)==false){
                System.out.println("Unknown "+s);
                continue;
            }
            boolean f = map.get(s);
            if(f){
                System.out.println("Opened by "+s);
            } else {
                System.out.println("Closed by "+s);
            }
            map.put(s, !f);
        }
        
        
        

    }

}