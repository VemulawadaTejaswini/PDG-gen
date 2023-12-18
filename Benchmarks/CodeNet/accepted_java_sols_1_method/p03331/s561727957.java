import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i));
        }

        if(sum == 1){
            System.out.println("10");
        }else{
            System.out.println(sum);
        }
    }
}