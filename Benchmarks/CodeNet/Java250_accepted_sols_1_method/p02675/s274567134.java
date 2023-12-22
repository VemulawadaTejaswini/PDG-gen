import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int num = N % 10;
        String a = null;
        
        if(num == 3){
            a = "bon";
        } else if(num == 0||num==1||num==6||num==8){
            a = "pon";
        } else {
            a ="hon";
        }
        
        System.out.println(a);
    }
}
