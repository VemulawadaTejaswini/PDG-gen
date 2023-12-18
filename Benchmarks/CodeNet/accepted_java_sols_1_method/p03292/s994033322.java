import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
//    String s=sc.next();
//    int x=sc.nextInt();
//    int a=sc.nextInt();
//    int b=sc.nextInt();
    int[] a={sc.nextInt(),sc.nextInt(),sc.nextInt()};
    Arrays.sort(a);
    System.out.println(a[2]-a[0]);
  }
}