import java.util.*;

public class Main{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String n = sc.next();
     String ans = "No";
     for(int i = 0; i<3 ; i++){
     	if(n.charAt(i) == '7') ans = "Yes";
     }
    System.out.println(ans);
  }
}