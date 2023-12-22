import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int[] t = new int[n];
    for (int i = 0;i<n;i++) {
      t[i] = sc.nextInt();
    }
    Arrays.sort(t);
    int count = 0;
    int base = t[0];
    int bus = 1;
    for(int i = 0;i<n;i++){
      if(t[i]>base+k || count == c){
        count=0;
        bus++;
        base = t[i];
      }
      count++;
    }
    System.out.println(bus);
  }
}
