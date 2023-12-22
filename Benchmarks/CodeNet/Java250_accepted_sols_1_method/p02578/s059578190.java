import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int[] max = new int[n];
    max[0]=arr[0];
    for(int i=1;i<n;i++){
      max[i]=Math.max(max[i-1],arr[i]);
    }
    long sum =0;
    for(int i=0;i<n;i++){
      sum+=max[i]-arr[i];
    }
    System.out.println(sum);
  }
}