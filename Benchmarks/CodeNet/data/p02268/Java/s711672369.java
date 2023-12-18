import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int ans=0;
    int n=sc.nextInt();
    int[] s;
    s=new int[n];
    for(int i=0;i<n;i++){
      s[i]=sc.nextInt();
    }
    int q=sc.nextInt();
    for(int i=0;i<q;i++){
      int t=sc.nextInt();
      int lo=0;
      int hi=n-1;
      while(lo<=hi){
        int mid=(lo+hi)/2;
        if(t==s[mid]){
          ans++;
          break;
        }else if(t>s[mid]){
          lo=mid+1;
        }else{
          hi=mid-1;
        }
      }
    }
    System.out.println(ans);
  }
}

