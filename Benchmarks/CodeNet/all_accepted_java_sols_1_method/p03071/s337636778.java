import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(Math.abs(a-b)>=2){
            if(a > b){
                System.out.println(a+(a-1));
            }else{
                System.out.println(b+(b-1));
            }
        }else{
            System.out.println(Math.max(a, b)+Math.min(a, b));
        }
    }
}