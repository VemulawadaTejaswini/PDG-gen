import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] m = new int[n];
    for(int i=0;i<n;i++){
      m[i] = sc.nextInt();
    }
    
    int sum=0;
    for(int i=0;i<n;i++){
      x-=m[i];
      sum++;
    }
    Arrays.sort(m);
    sum+=x/m[0];
    System.out.println(sum);
  }
}