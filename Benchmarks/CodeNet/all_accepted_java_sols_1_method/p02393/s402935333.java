import java.util.*;
import java.lang.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = new int[3];
  
        for (int i = 0; i < 3; i++) {
            numbers[i] = sc.nextInt();
        }
    
        Arrays.sort(numbers);
        
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}
