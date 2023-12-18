import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        if(W>=S)
        {
            System.out.println("unsafe");
        }
        else
        {
            System.out.println("safe");
        }
    }
}
