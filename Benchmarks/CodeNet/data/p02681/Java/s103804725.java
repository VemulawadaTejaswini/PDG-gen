import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    String S=s.next();
    String T=s.next();
    String box="";
	for(int i=0;i<S.length();i++) box+=T.charAt(i);
    System.out.println(box.equals(S)?"Yes":"No");
  }  
}