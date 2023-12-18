        import java.util.*;
        class Main{
          public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            long a = 1;
            long b = 1;
            long c = 1;
            long d = 1000000007;
            
            
            for(int i = 1; i <= N ; i++){
              a *= 10;
              b *= 8;
              c *= 9;
              a = a % d;
              b = b % d;
              c = c % d;
                
            }     
            
            System.out.println(a + b - 2*c);
          }
        }