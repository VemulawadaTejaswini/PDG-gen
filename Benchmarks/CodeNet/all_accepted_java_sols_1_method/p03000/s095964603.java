import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int ans=1;
    int l[]=new int[n];
    
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
    }
    int d=0;
    for(int i=0;i<n;i++){
      d=d+l[i];
      if(d<=x){
        ans++;
      }
      else{
        break;
      }
    }
    System.out.println(ans);
  }
}
