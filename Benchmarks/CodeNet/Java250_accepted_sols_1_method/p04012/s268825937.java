import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Map<Character, Integer> dic = new HashMap<>();
        String w = in.next();
        for (int i = 0; i < w.length(); i++){
            if (dic.containsKey(w.charAt(i))){
                dic.put(w.charAt(i), dic.get(w.charAt(i)) +1);
            }
            else {
                dic.put(w.charAt(i), 1);
            }
        }
        for (Character c: dic.keySet()){
            if (dic.get(c) %2 != 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}