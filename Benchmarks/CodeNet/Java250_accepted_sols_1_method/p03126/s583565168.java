import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=new int[31];
    for(int i=0;i<n;i++){
      int k=sc.nextInt();
      for(int j=0;j<k;j++){
        a[sc.nextInt()]++;
      }
    }
    int c=0;
    for(int i=0;i<31;i++){
      if(a[i]==n){
        c++;
      }
    }
    System.out.println(c);
  }
}