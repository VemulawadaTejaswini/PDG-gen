import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> li = new ArrayList<>();
    for(int i = 0;i < N;i++){
      li.add(sc.nextInt());
    }
    int total = 0;
    for(int j = N - 1;j > 0;j--){
      for(int k = 0;k < j;k++){
        total += li.get(j) * li.get(k);
      }
    }
    System.out.println(total);
  }
}
