import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int A;
        int B;
        int total = 0;
        
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();
        //System.out.println(A + "" + B);
        
        for(int i = 0; i < 2; i++){
            if(A >= B){
                total += A;
                A--;
            }else{
                total += B;
                B--;
            }
        }
        System.out.println(total);
        
    }
}
