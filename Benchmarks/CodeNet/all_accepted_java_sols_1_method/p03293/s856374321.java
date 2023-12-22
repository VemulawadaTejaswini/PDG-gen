import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    //String blank = sc.nextLine();
    String t = sc.nextLine();
    String s1 = s;
    String s2 = null;
    boolean flag = false;

    for(int i = 0; i < s.length(); i++){
      s2 = s1.charAt(s1.length()-1) + s1.substring(0, s1.length()-1);
      if(s2.equals(t)){flag = true; break;}
      s1 = s2;
      s2 = null;
    }

    if(flag == true){System.out.println("Yes");}
    else{System.out.println("No");}

  }
}
