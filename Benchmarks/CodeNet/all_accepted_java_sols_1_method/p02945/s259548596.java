import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result[] = new int[3];

        
        result[0] = a+b;
        result[1] = a-b;
        result[2] = a*b;
      
        int max=result[0];

        
        for (int i=0; i<result.length;i++) {
            int v = result[i];
            if(v > max) {
                max=v;
            }
        }
        System.out.println(max);
        
        
        
    }
}
