import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Your code here!
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String str = String.valueOf(a) + String.valueOf(b);
        
        int num = Integer.parseInt(str);
        
        // double result = Math.sqrt((double)num);
        // System.out.print(result);
        
        for(int i = 1; i<= 1000;i++){
            if(num == i * i){
                System.out.print("Yes");
                return;
            }
        }
        
        System.out.println("No");
    }
}
