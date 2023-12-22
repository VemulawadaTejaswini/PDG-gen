import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
      	Set<Integer> num = new HashSet<>();
      	for(int i=0;i<K;i++){
          int di = sc.nextInt();
          for(int j=0;j<di;j++){
            int Ai = sc.nextInt();
            num.add(Ai);
          }
        }
 	      System.out.println(N - num.size());
    }
}