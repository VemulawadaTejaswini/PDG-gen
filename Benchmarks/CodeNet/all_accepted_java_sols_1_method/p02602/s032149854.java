import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
      
      List<Integer> points = new ArrayList<Integer>();
      for(int i=0;i<N;i++){
            points.add(sc.nextInt());
      }
      
      for(int i=K;i<N;i++){
        if(points.get(i-K) < points.get(i)){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
    }
}