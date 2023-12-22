import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
 
        //Nから繰り返し7を引き、4で割れる数を探す。
        for(int i = 0; i < N; i++){
            if((N - i * 7) >= 0 && ((N - i * 7) % 4) == 0){
                System.out.println("Yes");
                N = -1;
                break;
            };
        }
        if(N != -1){
            System.out.println("No");
        }
    }
}
