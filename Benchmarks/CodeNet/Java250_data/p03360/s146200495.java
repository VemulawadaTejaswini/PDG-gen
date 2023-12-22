import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ar = new ArrayList<Integer>();
    int A = sc.nextInt();
    ar.add(A);
    int B = sc.nextInt();
    ar.add(B);
    int C = sc.nextInt();
    ar.add(C);
    int K = sc.nextInt();
    Collections.sort(ar);
    for(int i=0;i<K;i++){
      if(ar.get(2) == A){
        ar.remove(2);
        A *= 2;
        ar.add(A);
      }else if(ar.get(2) == B){
        ar.remove(2);
        B *= 2;
        ar.add(B);
      }else{
        ar.remove(2);
        C *= 2;
        ar.add(C);
      }
    }
    Collections.sort(ar);
    System.out.println(ar.get(0)+ar.get(1)+ar.get(2));
  }
}
