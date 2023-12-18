import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String up = s.toUpperCase();
        String down = s.toLowerCase();
        
        char x;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == up.charAt(i)){
                x=down.charAt(i);
            }
            else x=up.charAt(i);
            System.out.print(x);
        }
        System.out.println();
    }
}
