import java.util.*;
import java.math.BigDecimal;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt();
    int[] a=new int[n];
    boolean[] f=new boolean[n-k];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      if(i>=k){
        if(a[i]>a[i-k]){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
    }
  }
}
