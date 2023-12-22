import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] h=new int[n];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    int hg=-1;
    int cn=0;
    for(int i=0;i<n;i++){
      if(hg<=h[i]){
        cn++;
        hg=h[i];
      }
    }
    System.out.println(cn);
  }
}