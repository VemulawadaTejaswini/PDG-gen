import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char n[] = sc.nextLine().toCharArray();
        int sum = 0;
        for(char c: n){
            sum += Character.getNumericValue(c);
        }
        if(sum % 9 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }    
}
