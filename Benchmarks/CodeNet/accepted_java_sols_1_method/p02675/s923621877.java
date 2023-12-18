import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String pencilCount = sc.next();
        char oneDigits = pencilCount.charAt(pencilCount.length()-1);
        
        
        if(oneDigits=='2' || oneDigits=='4' || oneDigits=='5' || oneDigits=='7' || oneDigits=='9'){
            System.out.println("hon");
        }
        else if(oneDigits=='0' || oneDigits=='1' || oneDigits=='6' || oneDigits=='8'){
            System.out.println("pon");
        }
        else{ // oneDigits=='3'
            System.out.println("bon");
        }
    }
}