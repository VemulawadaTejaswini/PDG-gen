import java.util.*;

class Main{
  public static void main(String[] args){
    ArrayList<String> array = new ArrayList<String>();
    Scanner in = new Scanner(System.in);
    while (in.hasNext()){
      int n = in.nextInt();
      if (n == 0){
        break;
      }
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
      array.add(s1 + " " + s2);
    } 
    for (String s: array){
      System.out.println(s);
    } 
  }
}