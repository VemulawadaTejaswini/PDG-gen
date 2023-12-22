import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total =b-a;
        int tall =0;
        
        for(int i = total; i > 0; i--){
            tall += i;
        }
        System.out.println(tall - b);
    }
} 