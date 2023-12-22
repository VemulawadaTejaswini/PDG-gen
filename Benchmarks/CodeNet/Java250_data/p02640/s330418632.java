import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner s = new Scanner(System.in);
        int hiki = s.nextInt();
        int asi = s.nextInt();
        int sum = hiki * 2;
        if( sum > asi || asi % 2 == 0 || sum * 2 < asi){
            for(int i = 0; i <= hiki; i++){
                if(i != 0) sum += 2;
            
                if(sum == asi){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No"); 
    }
}
