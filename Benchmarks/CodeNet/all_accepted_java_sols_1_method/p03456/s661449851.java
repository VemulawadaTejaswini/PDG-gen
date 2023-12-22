import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        for(int i = 1; i <= 317; i++){
            if(i*i == Long.parseLong(a+b)){
                System.out.println("Yes");
                return;
            }
        }
        
        System.out.println("No");
    }
}
