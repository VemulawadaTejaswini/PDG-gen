import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] arr1 = new int[n];
    for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
       arr1[i]=arr[i];
    }
    Arrays.sort(arr1);
    int count=0;
    for(int i=0;i<n;i++){
      if(arr1[i]!=arr[i]){
        count++;
      }
    }
    if(count>2){
      System.out.println("NO");
    }
    else{
      System.out.println("YES");
    }
  }
}
    