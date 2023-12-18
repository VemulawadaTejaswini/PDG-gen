import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int [] A = new int [N];
        long number =1;
        try{
        for(int i=0; i<N; i++){
            A[i] = scanner.nextInt();
            number = number * A[i];
        }
                
        System.out.println(number);
        
        }catch(InputMismatchException e){
            System.out.println(-1);
        }
    }
}
