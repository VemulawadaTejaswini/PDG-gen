import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r,D,x,i;
    int[] a = new int[10];
    r = sc.nextInt();
    D = sc.nextInt();
    x = sc.nextInt();
    a[0] = (r*x)-D;
    System.out.println(a[0]);
    for(i=1;i<10;i++){
      a[i] = (r*a[i-1])-D;
      System.out.println(a[i] + "\n");
    }
  }
}