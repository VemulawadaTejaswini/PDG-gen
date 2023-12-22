import java.util.*;
import java.util.Collections;

class Main{
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = 0;
    List<Integer> list = new ArrayList<>();
    for(int i = 0; i < A; i++){
      list.add(sc.nextInt());
    }
    Collections.sort(list,Collections.reverseOrder());
    for(int j = 0; j < B; j++){
      ans =  ans + list.get(j);
    }
    System.out.println(ans);
  }
}
