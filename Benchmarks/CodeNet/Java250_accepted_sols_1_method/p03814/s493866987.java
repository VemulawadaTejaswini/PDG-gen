import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int a = 0;
        int z = 0;
        boolean ba = true;
        boolean bb = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A' && ba){
                a = i;
                ba = false;
            }
            if(s.charAt(s.length() - i - 1) == 'Z' && bb){
                z = s.length() - i - 1;
                bb = false;
            }
            if(!ba && !bb){
                break;
            }
        }
        System.out.println(z - a + 1);
    }
}