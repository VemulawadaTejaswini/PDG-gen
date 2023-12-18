import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=0;
    n = sc.nextInt();
    int[] a = new int[n] ;
    int i,j;
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(i=n;i>1;i--){
      for(j=0;j<i-1;j++){
        int c=a[j];
        a[j]=a[j+1];
        a[j+1]=c;
      }
    }
    System.out.printf("%d",a[0]);
    for(i=1;i<n;i++){
      System.out.printf(" %d",a[i]);
    }
    System.out.println();
    sc.close();
  }
}
