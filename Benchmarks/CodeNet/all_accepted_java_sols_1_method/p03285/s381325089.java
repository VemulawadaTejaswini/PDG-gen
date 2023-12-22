import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i <= N/4; i++){
            for(int j = 0; j <= N/7; j++){
                if( i * 4 + j * 7 == N ){
                    flag = true;
                    break;
                }
            }
        }
        
        System.out.println( flag ? "Yes" : "No" );
        
    }
}
