import java.util.Scanner;

public class Main{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    int i;
    for(i=0; i<n;i++){
      a[i] = scanner.nextInt();
    }

    for(; i>0; i--){
                System.out.print(a[i-1]);
                if(i-1 != 0) System.out.print(" ");
                else System.out.println();
  }
}
}