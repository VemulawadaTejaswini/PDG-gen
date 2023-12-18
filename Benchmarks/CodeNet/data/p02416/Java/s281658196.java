import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String n = sc.next();
            int sum = 0;
            if(n.equals("0")){
                break;
            }else{
                char []numbers = n.toCharArray();
                for(char number : numbers){
                    sum += Character.getNumericValue(number);
                }
            }
            System.out.println(sum);
        }
        
    }
}
