import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),sum=0,f=0;
    int[] a=new int[n],b=new int[n],c=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      if(a[i]%2==0){
        f++;
      }
    }
    sum=(int)Math.pow(3,n)-(int)Math.pow(2,f);
    System.out.print(sum);
  }
}
