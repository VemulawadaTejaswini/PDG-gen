import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] n={sc.nextInt(),sc.nextInt(),sc.nextInt()};
    Arrays.sort(n);
    System.out.println(n[0]+n[1]+10*n[2]);
  }
}