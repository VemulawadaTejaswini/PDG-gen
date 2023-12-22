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
    String s = sc.next();
    String t = sc.next();
	int a = sc.nextInt();
    int b = sc.nextInt();
    String u = sc.next();
    //char[] a = sc.nextLine().toCharArray();
    if(s.equals(u)){
      a--;
    }
    else
    {
      b--;
    }
    System.out.println(a + " " + b);
  }
}