import java.util.*;

class Main() {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    int P = 200003;
    
    String sN = scan.nextLine();
    int N = Integer.valueOf(sN);
    
    for (int i = 0;i < N;i ++) {
      int val = scan.nextInt();
      list.add(val);
    }
    
    int sum = 0;
    for (int i = 0;i < N-1;i ++) {
      for (int j = i+1;j < N;j ++) {
        int Ai = list.get(i);
        int Aj = list.get(j);
        int mul = Ai * Aj;
        int sur = mul % P;
        sum += sur;
      }
    }
    
    System.out.println(sum);
  }
}
        
      
    