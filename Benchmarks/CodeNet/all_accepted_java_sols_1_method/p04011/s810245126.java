import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int K = sc.nextInt();
       int X = sc.nextInt();
       int Y = sc.nextInt();
       int total = 0;
       for(int a = 1;a <= N;a++){
           if(a <= K){
               total += X;
           }else{
               total += Y;
           }
       }
       System.out.println(total);
    }
}
