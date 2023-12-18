import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    boolean[] vis = new boolean[n];
    for(int i=0;i<n;i++){
      vis[i]=true;
    }
    boolean[] vis1 = new boolean[n];
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      vis1[a-1]=true;
      vis1[b-1]=true;
      if(arr[a-1]>arr[b-1]){
        vis[b-1]=false;
      }
      if(arr[a-1]==arr[b-1]){
          vis[b-1]=false;
          vis[a-1]=false;
      }
      // else{
      //   vis[b-1]=false;
      // }
      if(arr[b-1]>arr[a-1]){
        vis[a-1]=false;
      }
      // else{
      //   vis[a-1]=false;
      // }
    }
    int count=0;
    for(int i=0;i<n;i++){
      if(vis[i]==true){
        count++;
      }
    }
    System.out.println(count);
  }
}