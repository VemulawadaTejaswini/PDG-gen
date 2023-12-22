import java.util.Scanner;
import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N=sc.nextLong();
    long K=sc.nextLong();
        if (K>N) {
          if(K-N<N){
            System.out.println(K-N);
          }else{
            System.out.println(N);
          }

        }else if(K==N){
          System.out.println(0);
        }else if(N>K){
          if(N%K>K-N%K){
            System.out.println(K-N%K);
          }else{
            System.out.println(N%K);
          }
        }

        }
      }
