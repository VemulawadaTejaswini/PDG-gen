import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Map<Character, Character> map = new HashMap<>();
        boolean result = true;
        
        for(int i = 0; i < str2.length(); i++){
            if(map.get(str2.charAt(i)) == null){
                if(map.containsValue(str1.charAt(i))){
                    result = false;
                    break;
                }else{
                    map.put(str2.charAt(i), str1.charAt(i));
                }
            }else{
                if(map.get(str2.charAt(i)) != str1.charAt(i)){
                    result = false;
                    break;
                }
            }
        }
        
        System.out.println(result ? "Yes" : "No");
    }
}
