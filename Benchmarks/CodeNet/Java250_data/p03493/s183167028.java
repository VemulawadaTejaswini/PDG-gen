import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for(char c : s.toCharArray() ) {
            if(c == '1') {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}