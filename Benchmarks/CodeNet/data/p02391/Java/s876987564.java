import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        bigOrSmall(a, b);
        
    }
    public static void bigOrSmall(int a, int b){
        if(a > b){
            System.out.println("a > b");
            
        }else if(a < b){
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
        }
    }
}
