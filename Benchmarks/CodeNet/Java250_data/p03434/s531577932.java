import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Integer a[] = new Integer[N];
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a,Comparator.reverseOrder());
    
    int Alice = 0;
    int Bob = 0;
    for(int i=0;i<N;i+=2){
      Alice += a[i];
    }
    for(int i=1;i<N;i+=2){
      Bob += a[i];
    }
    
    System.out.println(Alice-Bob);
  }
}