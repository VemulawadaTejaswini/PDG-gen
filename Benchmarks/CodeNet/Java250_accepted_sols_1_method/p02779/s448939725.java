import java.util.*;
public class Main {
  /*
  private static void roop(int a, int b){
    for(int i = 0; i < a; i++){
      System.out.print(b);
    }
    System.out.println();
  }
  */
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set<Integer> set = new HashSet<Integer>();
    boolean flg = true;
    int tmp;
    for(int i = 0; i < n; i++){
      tmp = sc.nextInt();
      if(!set.contains(tmp)){
        set.add(tmp);
      }
      else
      {
        flg = false;
        break;
      }
    }
    //char[] a = sc.nextLine().toCharArray();
    
    if(flg)
    {
      System.out.println("YES");
    }
    else
    {
      System.out.println("NO");
    }
  }
}