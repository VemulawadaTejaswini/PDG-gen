import java.util.*;

public class Main {
    
    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final int S = scanner.nextInt();
        final int W = scanner.nextInt();
        if(S <= W){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }

    }
}