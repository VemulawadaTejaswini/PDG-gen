import java.util.*;
import java.util.Comparator;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer [] a = new Integer[N];
    for(int i = 0;i<N;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a, Comparator.reverseOrder());
    long sum = a[0];

    if(N%2==0){
      for(int i = 1;i<N/2;i++){
        sum += (long)a[i]*2;
        }
    }else{
      int tmp = 0;
      for(int i = 1;i<N/2;i++){
        sum += (long)a[i]*2;
        tmp = i;
      }
        sum += (long)a[tmp+1];
    }
    System.out.println(sum);
  }
}