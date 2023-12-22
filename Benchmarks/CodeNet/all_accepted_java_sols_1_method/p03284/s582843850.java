import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int wari = N % K;
        
        if(wari == 0){
            System.out.println(0); 
        }else {
            System.out.println(1);
        }
    }
}