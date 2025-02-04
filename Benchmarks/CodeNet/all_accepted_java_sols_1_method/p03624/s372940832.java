import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){
            {
                put('a', 0);
                put('b', 0);
                put('c', 0);
                put('d', 0);
                put('e', 0);
                put('f', 0);
                put('g', 0);
                put('h', 0);
                put('i', 0);
                put('j', 0);
                put('k', 0);
                put('l', 0);
                put('m', 0);
                put('n', 0);
                put('o', 0);
                put('p', 0);
                put('q', 0);
                put('r', 0);
                put('s', 0);
                put('t', 0);
                put('u', 0);
                put('v', 0);
                put('w', 0);
                put('x', 0);
                put('y', 0);
                put('z', 0);
            }
        };
        
        for(int i = 0; i < str.length(); i++){
            int n = map.get(str.charAt(i));
            n += 1;
            map.put(str.charAt(i), n);
        }
        
        Iterator entries = map.entrySet().iterator();
        
        if(!((map.values().contains(0))))
            System.out.println("None");
        else
            for(int i = 0; i < map.size(); i++){
                Map.Entry entry = (Map.Entry)entries.next();
		if((int)entry.getValue() == 0){
                    System.out.println((Character)entry.getKey());
                    break;
                }
            }
    }
}
