import java.util.*;

public class Main {
    public static void main(String[] args)  throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int primeCounter = 0;
        for (int i = 0;i<N;i++){
            int b = sc.nextInt();
            for (int j = 2;j<=b;j++){
                if(b==j){
                    primeCounter++;
                }else if(b%j==0){
                    break;
                }
            }
        }
        System.out.println(primeCounter);
        sc.close();
    }
}