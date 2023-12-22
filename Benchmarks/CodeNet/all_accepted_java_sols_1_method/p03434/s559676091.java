import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();    
    ArrayList<Integer> list = new ArrayList<>();
    int sum = 0;
    
    for(int i=0; i<N; i++) {
      list.add(sc.nextInt());
    }
    Collections.sort(list, Collections.reverseOrder());
    for(int j=0; j<list.size(); j++) {
      if(j % 2 == 0) {
        sum += list.get(j);
      } else {
        sum -= list.get(j);
      }
    }
    System.out.println(sum);
  }
}
