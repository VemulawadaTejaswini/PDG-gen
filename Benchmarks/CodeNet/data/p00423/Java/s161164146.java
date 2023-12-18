import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    while (in.hasNext()){
      int n = in.nextInt();
      int s1 = 0;
      int s2 = 0;
      for (int i = 0; i < n; i++){
        int p1 = Integer.parseInt(in.next());
        int p2 = Integer.parseInt(in.next());
        if (p1 > p2){
          s1 += p1 + p2;
        }else if (p1 < p2){
          s2 += p1 + p2;
        }else if (p1 == p2){
          s1 += p1;
          s2 += p2;
        }
      }
      System.out.println(s1 + " " + s2);
    }  
  }
}