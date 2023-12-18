import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    boolean[] arr = new boolean[n];
    for(int i=0;i<k;i++){
      int d = sc.nextInt();
      for(int i2=0;i2<d;i2++){
        int s = sc.nextInt();
        arr[s-1]=true;
      }
    }
    int count=0;
    for(int i1=0;i1<n;i1++){
      if(arr[i1]==false){
        count++;
      }
    }
    System.out.println(count);
  }
}