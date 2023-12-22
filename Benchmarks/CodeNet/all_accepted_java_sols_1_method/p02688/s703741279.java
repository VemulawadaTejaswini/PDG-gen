import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());

    int[] d = new int[k];
    boolean[] t = new boolean[n];
    for(int i=0; i<k; i++){
      d[i] = Integer.parseInt(sc.next());
      for(int j=0; j<d[i]; j++){
        t[Integer.parseInt(sc.next())-1] = true;
      }
    }
    int T=0;

    for(int i=0; i<n; i++){
      if(t[i] != true)
        T++;
    }

    System.out.println(T);
    

  }
}
