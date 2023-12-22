import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N;
    int Alice = 0;
    int Bob = 0;
    ArrayList<Integer> L = new ArrayList<Integer>();
    N = s.nextInt();
    for(int i = 0; i < N ;i++){
      L.add(s.nextInt());
    }
    Collections.sort(L);
    for(int i = 0; i < N ;i += 2){
      Alice += L.get(i);
    }
    for(int i = 1; i < N ;i += 2){
      Bob += L.get(i);
    }
    System.out.printf("%d",Math.abs(Alice - Bob));
  }
}
