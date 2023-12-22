import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        
        String safety = null;
        
        if(W >= S){
            safety = "unsafe";
        } else {
            safety = " safe";
        }
        
        System.out.println(safety);
    }
}
