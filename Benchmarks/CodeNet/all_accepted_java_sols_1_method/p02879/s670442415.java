import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a,b,result=0;
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a < 10 && b < 10){
            result = a * b;
        }else{
            result = -1;
        }
        
        
        System.out.println(result);
    }
}
