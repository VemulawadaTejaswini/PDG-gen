import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),f=0;
    String s=sc.next(),t=sc.next();
    for(int i=n-1;i>=0;i--){
      if(s.substring(n-1-i,n).equals(t.substring(0,i+1))){
        System.out.println(2*n-i-1);
        f++;
        break;
      }
    }
    if(f==0){
      System.out.println(2*n);
    }
  }
}
