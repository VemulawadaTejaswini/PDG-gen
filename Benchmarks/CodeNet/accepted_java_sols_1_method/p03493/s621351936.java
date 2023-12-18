import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 0; 
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') cnt++;
        }
        System.out.println(cnt);

    }
}
