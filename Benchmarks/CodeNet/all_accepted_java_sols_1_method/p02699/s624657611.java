import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int hituzi = sc.nextInt();
        int ookami = sc.nextInt();
        if(ookami >= hituzi){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }
    }
}
