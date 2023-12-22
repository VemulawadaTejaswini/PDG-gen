import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=1;
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      if(a[i]%2==0){
        if(a[i]%3==0||a[i]%5==0){
        }else{
          f=0;
          break;
        }
      }
    }
    if(f==0){
      System.out.print("DENIED");
    }else{
      System.out.print("APPROVED");
    }
  }
}