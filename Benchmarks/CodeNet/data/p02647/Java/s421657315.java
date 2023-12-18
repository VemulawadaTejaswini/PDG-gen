import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt();
    int[] a=new int[n],b=new int[n],c=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      b[i]++;
      if(a[i]>0&&i-a[i]>=0){
        b[i-a[i]]++;
      }
      if(a[i]>0&&i+a[i]<n){
        b[i+a[i]]++;
      }
    }
    for(int j=0;j<k;j++){
      for(int i=0;i<n;i++){
        a[i]=b[i];
      }
      for(int i=0;i<n;i++){
        if(a[i]>0&&i-a[i]>=0){
          b[i-a[i]]++;
        }
        if(a[i]>0&&i+a[i]<n){
          b[i+a[i]]++;
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
  }
}
