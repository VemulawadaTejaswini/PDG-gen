import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        
        int res = 0;
        
        for (int i = 4; i <= M; i++) {
            for(int k = 22; k <= D; k++){
                String str = Integer.toString(k);
                String[] A = str.split("");
                if(Integer.parseInt(A[1]) >= 2 &&
                  i == Integer.parseInt(A[0]) * Integer.parseInt(A[1])){
                  res += 1;
                }
            }
        }
        
        System.out.println(res);
    }
}