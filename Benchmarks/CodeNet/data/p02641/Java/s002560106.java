import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
      	if(N==0){
          System.out.println(String.valueOf(X));
          return;
        }
      
      List<Integer> forbits = new ArrayList<Integer>();
      for(int i=0;i<N;i++){
          forbits.add(sc.nextInt());
        }
      
      int diff = 0;
      int answer = 0;
      while(true){
        if(!forbits.contains(N-diff)){
          answer = N-diff;
          break;
        }
        if(!forbits.contains(N+diff)){
          answer = N+diff;
          break;
        }
        diff++;
      }
      
      System.out.println(String.valueOf(answer));
    }
}