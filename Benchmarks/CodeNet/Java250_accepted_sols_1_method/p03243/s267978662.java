import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int new_num = num;
        int hundreds = num / 100;
        int tens = ((num / 10) % 10);
        int ones = num % 10;
        if(tens < hundreds){
            new_num = new_num + ((hundreds - tens) * 10);
            if(ones > hundreds){
                new_num = new_num - (ones - hundreds);
            }else{
                new_num = new_num + (hundreds - ones);
            }
        }else if((tens == hundreds) && (ones < hundreds)){
            new_num = new_num + (hundreds - ones);
        }else{
            new_num = ((hundreds + 1) * 100) + ((hundreds + 1) * 10) + (hundreds + 1);
        }
        
        if((hundreds == tens) && (tens == ones)){
            new_num = num;
        }
        
        System.out.println(String.valueOf(new_num));

    }
}
