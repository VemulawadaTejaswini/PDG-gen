import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] v=new int[n];
    for(int i=0;i<n;i++){
      v[i]=sc.nextInt();
    }
    int[] c=new int[n];
    for(int i=0;i<n;i++){
      c[i]=sc.nextInt();
    }
    int max=0;
    for(int i=0;i<n;i++){
      max+=Math.max(v[i]-c[i],0);
    }
    System.out.println(max);
  }
}