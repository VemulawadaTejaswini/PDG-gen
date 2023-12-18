import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hiddenKey = sc.next();
        String part = sc.next();

        SortedSet<String> validKeys = new TreeSet<>();
        for(int place=0; place<=hiddenKey.length()-part.length(); place++){
            boolean valid = true;
            for(int j=0; j<part.length(); j++){
                if(hiddenKey.charAt(place+j)!='?' && hiddenKey.charAt(place+j)!=part.charAt(j)){
                    valid=false;
                    break;
                }
            }
            if(valid){
                String key = "";
                for(int i=0; i<hiddenKey.length(); i++){
                    if(i>=place && i<place+part.length()){
                        key = key + part.charAt(i-place);
                    }else{
                        key = key + (hiddenKey.charAt(i)=='?' ? 'a' : hiddenKey.charAt(i));
                    }
                }
                validKeys.add(key);
            }
        }
        if(validKeys.isEmpty()) System.out.println("UNRESTORABLE");
        else System.out.println(validKeys.first());
    }
}
