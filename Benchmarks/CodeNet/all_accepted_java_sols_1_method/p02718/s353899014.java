import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    double m = scan.nextDouble();
    int a[] = new int[n];
    double summation = 0;
    for (int i = 0; i < n; i++){
      int c = scan.nextInt(); 
      a[i] = c;
      summation = summation + (double)c;
    }
    double border = Math.ceil(summation/(4*m));
    int judge = 0;
    for (int i =0; i < n; i++){
      if (a[i] >= border){
        judge++;
      }
    }
    if (judge >= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}