import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Vector<Long> v = new Vector<>();
    int q = sc.nextInt();
    int cnt = -1;
    for(int i = 0 ; i < q ; i++){
      int query = sc.nextInt();
      switch(query){
        case 0: long x = sc.nextLong(); v.add(x); cnt++; break;
        case 1: int p = sc.nextInt(); System.out.println(v.get(p)); break;
        case 2: v.remove(cnt--); break;
      }
    }
  }
}
