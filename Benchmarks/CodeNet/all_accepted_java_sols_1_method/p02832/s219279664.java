import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int index = 1;
    int broken = 0;
    boolean b = false;
    for(int i=0; i<N; i++){
      A[i]=sc.nextInt();
      if(A[i] == index){
        b = true;
        index++;
      }else{
        broken++;
      }
    }
    if (b){
      System.out.println(broken);
    }else{
      System.out.println("-1");
    }
  }
}
    