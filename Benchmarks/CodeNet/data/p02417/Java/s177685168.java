import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> alphabet = new HashMap<Character,Integer>();
        for(char i = 'a'; i <= 'z' ;i++){
            alphabet.put(i,0);
        }
        while(sc.hasNext()) {
        String str = sc.next();
         str = str.toLowerCase();
        for(int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            if(alphabet.containsKey(c)){
                int count = alphabet.get(c) + 1;
                alphabet.put(c,count);
            }
        }
    }
        sc.close();
        for(char i:alphabet.keySet()){
            System.out.println(i + " : " + alphabet.get(i));
        }
    }
}
