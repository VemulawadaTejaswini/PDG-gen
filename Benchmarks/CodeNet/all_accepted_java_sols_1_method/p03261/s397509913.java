import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        String ans = "Yes";
        HashSet<String> set = new HashSet<>();
        String s = sc.next();
        set.add(s);
        char end = s.charAt(s.length()-1);
        
        for(int i = 1; i < n; i++){
            s = sc.next();
            if(set.contains(s) || s.charAt(0) != end){
                ans = "No";
                break;
            }
            set.add(s);
            end = s.charAt(s.length()-1);
        }
        
        System.out.println(ans);
    }
}