import java.util.*;
class Main{
  public static void main(String[] args){
    Set<Character>set = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    set.add(s.charAt(0));
    set.add(s.charAt(1));
    set.add(s.charAt(2));
    set.add(s.charAt(3));
    if(set.size()==2)System.out.println("Yes");
    else System.out.println("No");
  }
}
