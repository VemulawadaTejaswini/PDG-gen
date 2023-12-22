import java.util.*;
import java.awt.*;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        char[] list = s.toCharArray();
        ArrayList<Character> c = new ArrayList<Character>();
        String ans = "Yes";
        for(int i = 0; i<4; i++){
            if(!c.contains(list[i])){
                c.add(list[i]);
            }
        }
        for(int i = 0; i<4; i++){
            int count = 0;
            for(int l = 0; l<4; l++){
                if(list[i]==list[l]){
                    count++;
                }
            }
            if(count > 2){
                ans ="No";
            }
        }
        if(c.size() != 2){
            ans ="No";
        }
        System.out.println(ans); 
    }
}
