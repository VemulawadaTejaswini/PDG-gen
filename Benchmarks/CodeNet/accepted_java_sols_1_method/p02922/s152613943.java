import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int socket = 1;
        int tap = 0;
        
        while(socket < B){
            socket += A - 1;
            tap++;
        }
        
        System.out.println(tap);
    }
}