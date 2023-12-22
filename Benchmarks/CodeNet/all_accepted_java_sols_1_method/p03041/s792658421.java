import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner cs = new Scanner(System.in);
    int n,k;
    String s;
    n=cs.nextInt();
    k=cs.nextInt();
    cs.nextLine();
    s=cs.nextLine();
    char[] c = s.toCharArray();
    c[k-1] = Character.toLowerCase(c[k-1]);
	System.out.println(String.valueOf(c));
    
  }
}