import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    StringBuffer buff = new StringBuffer();
    for(int i=0;i<n;i++){
      buff.append(s.charAt(i));
      buff.append(t.charAt(i));
    }
    System.out.println(buff);
  }
}
