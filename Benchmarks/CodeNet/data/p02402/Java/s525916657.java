import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long a = 0;

        long max = -1000000;
        long min = 1000000;
        long sum = a;
    	
            //ystem.out.println(n);
            
        for(int i = 0;i < n;i++){

            a =sc.nextLong();

            if(max < a){
                max = a;
            }
            if(min> a){
                min = a;
            }
            sum = sum + a;
        }
        System.out.println(min + " " + max + " " +sum);
    }
}


