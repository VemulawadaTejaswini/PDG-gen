import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ca = scanner.next().toCharArray();
        boolean fl1 = false;
        if(ca[0] != 'A'||Character.isUpperCase(ca[1])){
            System.out.println("WA");
            return;
        }
        for (int n = 2;n < ca.length - 1;++n){
            if(ca[n] == 'C'){
                if(fl1){
                    System.out.println("WA");
                    return;
                }
                else fl1 = true;
            }
            else if(Character.isUpperCase(ca[n])){
                System.out.println("WA");
                return;
            }
        }
        if(fl1&&Character.isLowerCase(ca[ca.length - 1])){
            System.out.println("AC");
        }
        else{
            System.out.println("WA");
        }
    }
}
