import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        
        for(int i=0;i<K;i++){
            if(i % 2 == 0){
                B += A / 2;
                A /= 2;
                
            }else{
                A += B / 2;
                B /= 2;
            }            
        }
        System.out.println(A+" "+B);
    }
}
