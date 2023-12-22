import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N>0){
            N-=1000;
        }
        System.out.println(N*-1);
    }
}