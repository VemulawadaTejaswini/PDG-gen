import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String n = s.next();
        int counter = 0;
        for(int i=0;i<n.length();i++){
            char c = n.charAt(i);
            if(c=='1')
                counter++;
        }
        System.out.println(counter);
    }
}
