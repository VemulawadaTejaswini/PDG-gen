import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int page;
        
        if(N%2 == 0){
            page = N/2;
        } else {
            page = N/2+1;
        }
        System.out.println(page);
        
    }
}
