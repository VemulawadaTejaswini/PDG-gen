import java.util.*;

public class Main{
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] brick = new int[n];
    int ans=0,p=1;
    
    for(int i=0;i<n;i++)brick[i]=sc.nextInt();
    for(int i=0;i<n;i++){
      if(brick[i]==p)p++;
      else ans++;
    }
    if(p==1)ans=-1;
    System.out.println(ans);
  }
}