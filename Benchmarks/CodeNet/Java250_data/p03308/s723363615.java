import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ar = new ArrayList<Integer>();
    int N = sc.nextInt();
    for(int i=0;i<N;i++){
      int A = sc.nextInt();
      ar.add(A);
    }
    Collections.sort(ar);
    System.out.println(Math.abs(ar.get(0)-ar.get(N-1)));
  }
}
