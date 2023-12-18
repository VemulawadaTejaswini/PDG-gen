import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            String s;
            s = scan.nextLine();
            if(s.charAt(0) == '0')break;
            int ans = 0;
            for(int i = 0; i < s.length(); i++){
                ans += s.charAt(i) - '0';
            }
            System.out.println(ans);
        }
    }
}

