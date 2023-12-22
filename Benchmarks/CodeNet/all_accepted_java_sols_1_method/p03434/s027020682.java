import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] val = new int[N];
    for(int i = 0; i < N; i++){
      val[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(val);
    int a = 0;
    int b = 0;
    for(int i = 0; i < N; i++){
      if(i%2==0){
        a += val[i];
      }else{
        b += val[i];
      }
    }
    System.out.println(Math.abs(a-b));
  }
}