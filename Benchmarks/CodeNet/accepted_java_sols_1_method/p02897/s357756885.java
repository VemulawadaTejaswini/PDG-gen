    import java.util.*;
     
    public class Main{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        int count = 0;
        for(int i = 1; i <= n; i++){
          k = i % 2;
          if(k != 0){
            count++;
          }
        }
        System.out.println((double)count / n);
      }
    }