import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int x = 0; x < n; x++){
      a[x] = sc.nextInt();
    }
    for(int y = n-1; y > 0; y--){
      System.out.print(a[y]+" ");
    }
    System.out.println(a[0]);
  }
}

