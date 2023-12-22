import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        
        int multiplier = scan.nextInt();
        
        int [] data = {number1,number2,number3};
        
        int maxnumber = 0;
        
        for(int i = 0; i < data.length; i++){
            maxnumber = Math.max(maxnumber,data[i]);
        }
        
        int max = maxnumber;
        
        for (int count = 0 ; count < multiplier ; count++){
            max = max * 2;
        }
        
        int ans = number1 + number2 + number3 + max - maxnumber;
 
        System.out.println(ans);
        
    }
}