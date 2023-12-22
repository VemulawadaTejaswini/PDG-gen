import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ar = new ArrayList<Integer>();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    int diff = B - A;
    if(diff + 1 > K){
      for(int i=0;i<K;i++){
        ar.add(A + i);
        ar.add(B - i);
      }
      Collections.sort(ar);
      ArrayList<Integer> li = new ArrayList<Integer>(new LinkedHashSet<>(ar));
      for(int i=0;i<li.size();i++){
        System.out.println(li.get(i));
      }
    }else{
      for(int i=A;i<=B;i++){
        System.out.println(i);
      }
    }
  }
}
