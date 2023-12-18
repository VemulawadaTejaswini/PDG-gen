import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        String T = sc.next();
        sc.close();
        Map<Character, Character>map1 = new HashMap<>();
        for(int i = 0; i < S.length(); i++){
            if(!(map1.containsKey(S.charAt(i)))){
                map1.put(S.charAt(i), T.charAt(i));
            } else {
                if(map1.get(S.charAt(i)) != T.charAt(i)){
                    System.out.println("No");
                    return;
                }
            }
        }

        Map<Character, Character>map2 = new HashMap<>();
        for(int i = 0; i < S.length(); i++){
            if(!(map2.containsKey(T.charAt(i)))){
                map2.put(T.charAt(i), S.charAt(i));
            } else {
                if(map2.get(T.charAt(i)) != S.charAt(i)){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}