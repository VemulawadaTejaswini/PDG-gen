import java.util.*;

public class Main{
  
  public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    for(int i = 0; i<N; i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    //System.out.println(a[0]);
    int Alice = 0;
    int Bob = 0;
    for(int i = N-1; i>=0; i-=2){
      Alice += a[i];
    }
    for(int i = N-2; i>=0; i-=2){
      Bob += a[i];
    }
    System.out.println(Alice-Bob);
  }
}
   