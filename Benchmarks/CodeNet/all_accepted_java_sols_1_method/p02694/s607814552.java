import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long m = 100;
        long count=0;
        
        for(int i=1;;i++){
            if(m>=X){
                break;
            }
            m = m + m/100;
            count++;
        }
        System.out.println(count);
    }
}