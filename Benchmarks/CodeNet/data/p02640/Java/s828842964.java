import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        
        if(Y%2==0 && 2*X<=Y && Y<=4*X){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
