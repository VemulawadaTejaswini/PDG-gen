import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();
    int K=sc.nextInt();
    int sum=0;
    int X[]=new int[N];
    Arrays.sort(X);
    for (int i=0; i<K; i++) {
    	sum += X[i];
    }
    System.out.println(sum);
  }
}