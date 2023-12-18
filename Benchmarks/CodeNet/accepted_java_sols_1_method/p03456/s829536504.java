import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[1];
    int[] b=new int[1];
    a[0]=sc.nextInt();
    b[0]=sc.nextInt();
    int kari=b[0];
    while(kari!=0){
      a[0]*=10;
      kari/=10;
    }
    double kari2=a[0]+b[0];
    double kari3=Math.sqrt(kari2);
    if((int)kari2==(int)kari3*(int)kari3) System.out.println("Yes");
    else System.out.println("No");
    System.out.flush();
  }
}