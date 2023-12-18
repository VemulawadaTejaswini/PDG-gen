import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        int cnt = 0;
        String search = sc.next();
        String word;
        final String END_OF_TEXT = "END_OF_TEXT";
        
        while(sc.hasNext()) {
            word = sc.next();
            
            if (word.equals(END_OF_TEXT)) {
                break;
            }
            
            if (word.equals(search)) {
                cnt++;
            }
        }
        
        System.out.print(cnt);
        
    }
}