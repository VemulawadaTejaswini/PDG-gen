import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a >= 13){
            System.out.println(b);
        }else if(a <= 5){
            System.out.println("0");
        }else{
            System.out.println(b / 2);
        }
    }
}
