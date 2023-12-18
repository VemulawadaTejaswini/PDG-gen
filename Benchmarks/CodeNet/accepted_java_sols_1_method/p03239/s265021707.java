import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ar = new ArrayList<Integer>();
    int N = sc.nextInt();
    int T = sc.nextInt();
    for(int i=0;i<N;i++){
      int c = sc.nextInt();
      int t = sc.nextInt();
      if(t <= T){
        ar.add(c);
      }
    }
    if(ar.size() != 0){
      Collections.sort(ar);
      System.out.println(ar.get(0));
    }else{
      System.out.println("TLE");
    }
  }
}
