import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();

        String ans = "No";
        for(;;){
            if(input == 0) break;
            
            int a = input % 10;
            input = input / 10;
            
            if(a == 7){
                ans = "Yes" ;
                break;
            }
        }
        
        System.out.println(ans);

    }
}
