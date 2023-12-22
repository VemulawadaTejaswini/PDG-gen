import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String n = in.next();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 4; i++){
            map.put(n.charAt(i), map.get(n.charAt(i)) == null ? 1: map.get(n.charAt(i))+1 );
        }
        if (map.size()== 2) System.out.println("Yes");
        else System.out.println("No");
    }
}