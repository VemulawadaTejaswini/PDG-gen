import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    ArrayList<String> S = new ArrayList<String>();
    for(int i = 0;i < N;i++){
      S.add(sc.next());
    }
    Collections.sort(S);
    for(int a = 0;a < N;a++){
      System.out.print(S.get(a));
    }
  }
}
