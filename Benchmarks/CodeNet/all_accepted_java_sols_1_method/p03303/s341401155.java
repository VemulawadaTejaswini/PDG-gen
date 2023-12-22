import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int w = input.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++){
            if (i%w == 0){
                sb.append(s.charAt(i));
            }
        }
        String ans = sb.toString();
        System.out.println(ans);
    }
}