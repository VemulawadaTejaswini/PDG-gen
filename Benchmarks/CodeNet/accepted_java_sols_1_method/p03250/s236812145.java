import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> ar = new ArrayList<Integer>(3);
    for(int i=0;i<3;i++){
      int abc = sc.nextInt();
      ar.add(abc);
    }
    Collections.sort(ar);
    System.out.println((int)ar.get(0)+(10 * (int)ar.get(2)+(int)ar.get(1)));
  }
}