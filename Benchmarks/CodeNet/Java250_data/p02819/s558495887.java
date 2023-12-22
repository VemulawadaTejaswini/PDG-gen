import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        if(X % 2 == 0 && X != 2){
            X++;
        }
        for(int i = 3; i < X; i += 2){
            if(i == X){
                break;
            }
            if(X % i == 0){
                X += 2;
                i = 3;
            }
        }
        
        System.out.println(X);
    }
}
