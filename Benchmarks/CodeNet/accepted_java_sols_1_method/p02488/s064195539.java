import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    TreeSet<String> S = new TreeSet<String>();
    for(int i=0;i<n;++i){
    	String s = sc.next();
    	S.add(s);
    }
    Iterator it = S.iterator();
    System.out.println(it.next());
  }
}