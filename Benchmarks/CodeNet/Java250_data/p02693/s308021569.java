import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        String a = "NG";
        
        for(int i=A;i<=B;i++){
            if(i%K == 0){
                a = "OK";
                break;
            }
        }
        System.out.println(a);
    }
}
