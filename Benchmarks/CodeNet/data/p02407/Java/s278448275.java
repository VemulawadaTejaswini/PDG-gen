import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] a = new int [100];
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      int A = sc.nextInt();
      a[i] = A;
    }
    for(int j=n-1;j>0;j--){
      System.out.printf("%d ",a[j]);
    }
    System.out.printf("%d\n",a[0]);
  }
}

