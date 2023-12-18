import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        
        int sum = 0;
        for(int i = 0; i<in.length(); i++) {
          char thisChar = in.charAt(i);
          sum += Character.getNumericValue(thisChar);
        }

        if(sum%9==0) {
          System.out.println("Yes");  
        }
        else {
          System.out.println("No");
        }
    }
}