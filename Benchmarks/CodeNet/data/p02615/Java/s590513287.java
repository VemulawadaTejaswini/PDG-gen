import java.util.*;
public class Main{
  public static void main(String[] args) 
  { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    long ans = arr[n-1];
    for(int i=n-3;i>=0;i--){
      ans = ans+Math.min(arr[i+1],arr[i+2]);
    }
    System.out.println(ans); 
  } 
}
