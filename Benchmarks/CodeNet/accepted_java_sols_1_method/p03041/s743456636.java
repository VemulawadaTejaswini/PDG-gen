import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,k;
    String s;
    n=sc.nextInt();
    k=sc.nextInt();
    sc.nextLine();
    s=sc.nextLine();
    char[] c = s.toCharArray();
    c[k-1] = Character.toLowerCase(c[k-1]);
	System.out.println(String.valueOf(c));
    
  }
}
