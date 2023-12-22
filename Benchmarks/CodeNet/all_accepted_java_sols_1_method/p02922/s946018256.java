import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int outlet = 1;
        int count = 0;
        if(B > 1){
            while(true){
                outlet += (A-1);
                count++;
                if(outlet >= B){
                    System.out.println(count);
                    break;
                }
            }
        }
        else{
            System.out.println(0);
        }
    }
}
