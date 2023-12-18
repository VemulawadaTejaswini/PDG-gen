import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String S = sc.next();
        int l = S.length();
        ArrayList<String> list = new ArrayList<String>();

        for(int i=0; i<l; i++){
            list.add(String.valueOf(S.charAt(i)));
        }

        Collections.sort(list);
        int x = 1;
        for(int i=1; i<l; i++){
            if(list.get(i).equals(list.get(i-1))){
                x += 1;
            }
            else{
                break;
            }
        }
        System.out.println(2 * Math.min(x, l - x));
    }
}