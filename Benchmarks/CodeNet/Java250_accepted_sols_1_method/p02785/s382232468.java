import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt(); //モンスターの数
    int K = scan.nextInt(); //必殺技の回数
    long[] H = new long[N+1];
    long MaxH = 0;

    for(int i=1; i<=N; i++) {
    	H[i] = scan.nextLong();
    }
    
    Arrays.sort(H);
    
    for(int i =1; i<=N-K; i++) {
    MaxH = MaxH + H[i];
    }
    System.out.println(MaxH);
  }
}