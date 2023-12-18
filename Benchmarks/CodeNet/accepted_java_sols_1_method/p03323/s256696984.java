import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if(A > 8 || B > 8){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }
    }
}
