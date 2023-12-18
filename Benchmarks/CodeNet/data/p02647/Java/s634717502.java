import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt();
    int[] a=new int[n],b=new int[n],c=new int[n];
    for(int j=0;j<n;j++){
      a[j]=sc.nextInt();
      b[j]++;
      for(int i=0;i<n;i++){
        for(int l=i-a[i];l<=i+a[i];l++){
          if(l>=0&&l<n&&l!=i&&Math.abs(l-i)-Math.abs(c[i])>0){
            b[l]++;
          }
        }
      }
      c[i]=a[i];
    }
    for(int j=0;j<k;j++){
      for(int i=0;i<n;i++){
        a[i]=b[i];
      }
      for(int i=0;i<n;i++){
        for(int l=i-a[i];l<=i+a[i];l++){
          if(l>=0&&l<n&&l!=i&&Math.abs(l-i)-Math.abs(c[i])>0){
            b[l]++;
          }
        }
      }
    }
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
  }
}
