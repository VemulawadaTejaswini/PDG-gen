import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s;
    s=sc.next();
    String d[]={"SUN","MON","TUE","WED","THU","FRI","SAT"};
    for(int i=0;i<7;i++){
      if(d[i].equals(s)){
        System.out.println(7-i);
        break;
      }
    }
  }
}
