import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'B'){
                if(sb.length() != 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
