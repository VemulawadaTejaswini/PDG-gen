import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String win_lose = sc.next();
        
        int lose_count = 0;
        
        for(int i = 0; i < win_lose.length(); i++){
            if(win_lose.charAt(i) == 'x'){
                lose_count++;
            }
        }
        
        if(lose_count >= 8){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
