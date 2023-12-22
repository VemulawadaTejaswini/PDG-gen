import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner stdIn = new Scanner(System.in);
        
        String s = stdIn.next();
        char c[] = s.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            if(c[i] == 'x'){
                count++;
            }
        }
        
        if(count >= 8){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}
