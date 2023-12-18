
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next(); // s muss t enthaalen
        int count = 0;
        int min = 99999;
        for (int i = 0; i < s.length()-t.length(); i++) {
            count = 0;
            for (int j = 0; j < t.length(); j++) {
                if(s.charAt(i+j)==t.charAt(j)){
                    
                } else {
                    count++;
                    
                }
                
            }
            if(min>count){
                min = count;
            }
        }
        System.out.println(min);
    }
}
