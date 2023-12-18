import java.util.*;

class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = -Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    
    List<Integer> list = new ArrayList<>();
    long sum = 0;
    for(int i=0;i<n;i++){
      if(i==0){
        list.add(-a[i]);
      }else{
        sum+=list.get(i-1);
        list.add(-a[i]);
        list.add(-a[i]);
      }
    }
    System.out.println(sum);
  }
}