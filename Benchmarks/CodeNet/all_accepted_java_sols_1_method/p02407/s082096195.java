import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    int n = sc.nextInt();
    int a[] = new int [n];

    for(int k=0; k<n; k++){
      a[k]=sc.nextInt();
    }

    for (int k=n-1; k>=0; k--){
      if(k==0)System.out.print(a[k]);
      else System.out.print(a[k]+" ");
    }
    System.out.printf("\n");
  }
}

