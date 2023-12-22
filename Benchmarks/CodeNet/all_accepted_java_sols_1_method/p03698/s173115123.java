
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            if(!set.add(str.charAt(i))){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }

}
