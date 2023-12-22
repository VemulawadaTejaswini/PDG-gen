import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x[] = new int[3];
    x[0]=sc.nextInt();
    x[1]=sc.nextInt();
    x[2]=sc.nextInt();
    int n = sc.nextInt();
    Arrays.sort(x);
    System.out.println((int)(x[0]+x[1]+x[2]*Math.pow(2,n)));
  }
  

  
}
