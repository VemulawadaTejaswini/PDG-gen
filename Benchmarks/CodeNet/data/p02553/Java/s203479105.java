        import java.util.*;
        class Main{
          public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            long x = a * c;
            long y = a * d;
            long z = b * c;
            long w = b * d;
            long[] aa = new long[4];
            
            aa[0] = x;
            aa[1] = y;
            aa[2] = z;
            aa[3] = w;
            int max = x;
         
            for(int i = 0; i < 4; i++){
              if(aa[i] > max){
                max = aa[i];
              }
            }
            System.out.println(max);
          }
        }