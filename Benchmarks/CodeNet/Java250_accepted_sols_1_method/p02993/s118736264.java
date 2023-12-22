import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String key = s.nextLine();
        char prev = 'a';
        for(char c:key.toCharArray()){
            if(prev==c){
                System.out.println("Bad");
                return;
            }
            prev=c;
        }
        System.out.println("Good");
    }
}