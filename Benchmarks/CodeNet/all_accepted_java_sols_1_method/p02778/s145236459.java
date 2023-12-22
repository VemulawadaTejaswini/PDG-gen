import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	char[] ch=sc.next().toCharArray();
    for(int i=0;i<ch.length;i++){
      ch[i]='x';
      System.out.print(ch[i]);
    }
  }
}
