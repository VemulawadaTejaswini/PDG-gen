import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b[]= new int[n-1];
    for(int i=0;i<n-1;i++)
    {
      b[i]=sc.nextInt();
    }
    if(n==2){
      System.out.println(b[0]*2);
      System.exit(0);
    }
    int sum=b[n-2]+b[0];
    for(int i=n-2;i>=1;i--){
      sum+=Math.min(b[i],b[i-1]);
    }
    System.out.println(sum);
  }
}