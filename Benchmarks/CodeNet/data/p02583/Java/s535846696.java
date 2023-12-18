import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[j]!=arr[i]){
          long a = arr[j]+arr[i];
          for(int k=j+1;k<n;k++){
          	if(arr[k]!=arr[i] && arr[k]!=arr[j] && valid(arr[i],arr[j],arr[k])){
            count++;
          	}
          }
      	}
      }
    }
    System.out.println(count);
  }
  public static boolean valid(int i, int j, int k){
    if(i+j<=k || i+k<=j || j+k<=i){
      return false;
    }
    return true;
  }
}
