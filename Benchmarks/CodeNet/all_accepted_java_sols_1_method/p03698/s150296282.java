import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        List<Character> used = new ArrayList<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(used.contains(c)){
                System.out.println("no");
                return;
            }
            used.add(c);
        }
        System.out.println("yes");
    }
}
