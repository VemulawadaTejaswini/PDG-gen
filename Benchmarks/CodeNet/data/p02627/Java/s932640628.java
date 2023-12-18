import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    String T[] ={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    for(int i=0;i<26;i++){
      if(S.equals(T[i])){System.out.println("A");System.exit(0);}
    }
    System.out.println("a");
  }
}
