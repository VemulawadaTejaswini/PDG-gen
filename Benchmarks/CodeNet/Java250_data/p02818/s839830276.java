import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        if(K<=A){
            System.out.println(A-K +" "+ B);    
        }else if(K>A && K<=A+B){
			System.out.println("0 " + (B-(K-A)));
        }else{
			System.out.println("0 0");            
        }
    }
}
