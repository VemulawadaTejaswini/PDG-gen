import java.util.*;

public class Main {
    
    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        boolean takahashiTurn = true;
        while(A>0 && C>0){
            if(takahashiTurn){
                C -= B;
            }else{
                A -= D;
            }
            takahashiTurn = !takahashiTurn;
        }
        if(A <= 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}