import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = Long.parseLong(sc.next());
    long M = (int)Math.sqrt(N);
    long Re = N+1;
    for(int i = 0;i<M;i++){
      if(N%(M-i)==0&&Re>M-i+N/(M-i)){
        Re = M-i+N/(M-i);
      }
    }
    System.out.println(Re-2);
  }
}