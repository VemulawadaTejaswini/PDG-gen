import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
    int[] b = new int[n];
    for (int i=0;i<n;i++){
      int t = scan.nextInt();
      a.put(t,i+1);
      b[i] = t;
    }
    Arrays.sort(b);
    for (int j=0;j<n-1;j++){
      System.out.print(a.get(b[j])+" ");
    }
    System.out.println(a.get(b[n-1]));
  }
}
