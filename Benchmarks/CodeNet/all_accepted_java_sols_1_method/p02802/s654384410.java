import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer,Integer> ACnum = new HashMap<>();
        Map<Integer,Integer> wamp = new HashMap<>();
        int wa=0;
        for (int i = 0; i< M; i++){

            Integer p = Integer.valueOf(sc.nextInt());
            if (sc.next().equals("AC")){
                ACnum.put(p,1);
            }else{
                if(!ACnum.containsKey(p)){
                    if(!wamp.containsKey(p)){
                        wamp.put(p,1);
                    }else{
                        wamp.put(p,wamp.get(p) + 1);
                    }
                }
            }

        }
        for(int key:wamp.keySet()){
            if(ACnum.containsKey(key)){
                wa+=wamp.get(key);
            }
        }
        System.out.println(ACnum.size() + " " + wa);
    }
}
