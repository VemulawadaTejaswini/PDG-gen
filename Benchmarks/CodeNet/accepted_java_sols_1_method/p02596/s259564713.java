import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scanner =new Scanner(System.in);
       int K=scanner.nextInt();
       int A = 7%K;

       for(int i=1;i<=K;++i){
           if(A==0){
                System.out.println(i);
                System.exit(0);
           }
           A = (A*10+7)%K;
           }
           System.out.println(-1);
       }
   }
