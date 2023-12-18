import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        
        if(R >= 0 && R < 1200){
            System.out.println("ABC");
        }else if(R >= 1200 && R < 2800){
            System.out.println("ARC");
        }else if(R >=2800 && R <=4208){
            System.out.println("AGC");
        }
    }
        
}
