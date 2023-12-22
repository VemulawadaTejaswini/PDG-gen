import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a >= 13){
            b = b;
        }else if(6 <= a && a <= 12){
            b = b / 2;
        }else{
            b = 0;            
        }
       System.out.println(b);
    }
}
