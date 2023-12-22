import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Set<Integer> member = new HashSet<Integer>();
    for(int i = 0 ; i < K ; i++){
      int d = sc.nextInt();
      for(int j = 0 ; j < d ; j++){
        int candy = sc.nextInt();
        member.add(candy);
      }
    }
        System.out.println(N - member.size());
	}
}
