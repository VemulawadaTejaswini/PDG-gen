import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String ans = "unsafe";
        
        if(n1>n2){
            ans = "safe";
        }
        
        System.out.println(ans);
    }
}
