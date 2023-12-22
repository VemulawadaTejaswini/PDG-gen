import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char tmp = s.charAt(0);
        StringBuilder result = new StringBuilder();
        
        for(int i=1; i<n; i++){
            char c = s.charAt(i);
            if(tmp != c){
                result.append(tmp);
                tmp = c;
            }
        }
        
        if(result.length() == 0 || result.charAt(result.length()-1) != tmp){
            result.append(tmp);
        }
        
        System.out.println(result.length());
    }
}