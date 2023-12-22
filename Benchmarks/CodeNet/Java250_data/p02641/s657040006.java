import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int x=sc.nextInt(),n=sc.nextInt(),min=301;
    int[] p=new int[n],a=new int[300-n];
    
    
    for(int i=0;i<n;i++){
      p[i]=sc.nextInt();
      
    }
    int l=0;
    for(int i=-150;i<150;i++){
      int f=0;
      for(int j=0;j<n;j++){
        if(i==p[j]){
          f++;
          break;
        }
      }
      if(f==0){
        a[l]=i;
        l++;
      }
    }
    
    if(n==0){
      System.out.println(x);
    }else{
      for(int i=0;i<a.length;i++){
        if(min<=(int)Math.abs(x-a[i])){
          System.out.println(a[i-1]);
          break;
        }else{
          min=(int)Math.abs(x-a[i]);
        }
      }
    }
  }
}
