import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long sum = 0;
    HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
    for (int i = 0;i<n;i++){
      int b = scan.nextInt();
      sum += b;
      if (a.get(b) == null){
        a.put(b,1);
      }
      else{
        int m = a.put(b,1);
        a.put(b,m+1);
      }
    }

    int m = scan.nextInt();
    for (int j=0;j<m;j++){
      int a1 = scan.nextInt();
      int a2 = scan.nextInt();
      if (a.get(a1) == null){
        System.out.println(sum);
        continue;
      }
      int gg = a.put(a1,0);
      sum += gg*(a2-a1);
      System.out.println(sum);
      if (a.get(a2) == null){
        a.put(a2,gg);
      }
      else{
        int mm = a.put(a2,0);
        a.put(a2,mm+gg);
      }
    }


  }
}
