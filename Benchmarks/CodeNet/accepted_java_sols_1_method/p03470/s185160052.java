import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> dan = new ArrayList<>();
    int N = sc.nextInt();
    int d[] = new int[N];
    
    
    for(int i=0; i<N; i++){
      d[i]=sc.nextInt();
      if(!dan.contains(d[i])){
        dan.add(d[i]);
      }
    }
    
    System.out.println(dan.size());
  }
}
    