import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int A [] = new int [1000];

    int max =0;
    int min =1000;
    int x;

    for(int i =0;i<N;i++){
      A[i] = sc.nextInt();

      max = Math.max(max,A[i]);
      min = Math.min(min,A[i]);
    }
     x = max-min;
     System.out.println(x);


}
}