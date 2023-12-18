import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt(), value = sc.nextInt();
        
        if(age >= 13){
            System.out.println(value);
        }else if(age <= 5){
            System.out.println(0);
        }else{
            System.out.println(value/2);
        }
        
    }
}
