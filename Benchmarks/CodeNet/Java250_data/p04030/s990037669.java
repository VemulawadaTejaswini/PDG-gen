import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='1')s.append(a.charAt(i));
            else if (a.charAt(i)=='0')s.append(a.charAt(i));
            else {
                if(s.length()!=0){
                    s.deleteCharAt(s.length()-1);
                }
            }
        }
        System.out.println(s);
    }
}
