import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
      Scanner sc=new Scanner(System.in);
      String[] param = sc.nextLine().split(" ");
      Integer N = Integer.parseInt(param[0]);
      Integer M = Integer.parseInt(param[1]);
      Integer C = Integer.parseInt(param[2]);
      
      String[] strB = sc.nextLine().split(" ");
      List<Integer> A = new ArrayList<>();
      List<Integer> B = new ArrayList<>();
      for(String b : strB) {
        B.add(Integer.parseInt(b));
        A.add(0);
      }
      
      int counter = 0;
      for(int index=0; index<N; index++) {
        int chk = 0;
        String[] strA = sc.nextLine().split(" ");
        for(int inner=0; inner<M; inner++) {
          A.set(inner, Integer.parseInt(strA[inner]));
          chk += A.get(inner) * B.get(inner);
        }
        
        chk += C;
        if( chk > 0 ) { counter++; }
      }
      
      System.out.println(counter);

    }
}
