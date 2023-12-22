import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
    Arrays.sort(a);
    int[] b = {5,5,7};
    if(Arrays.toString(a).equals(Arrays.toString(b))){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}