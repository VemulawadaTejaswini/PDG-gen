import java.util.*;

public class Main {

    public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        long num = 0;
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            num = sc.nextLong();
            if (i % 2 != 0 && num % 2 != 0) {
                answer += 1;
            }         
          }
        sc.close();

        System.out.println(answer);
      
      }
    
}