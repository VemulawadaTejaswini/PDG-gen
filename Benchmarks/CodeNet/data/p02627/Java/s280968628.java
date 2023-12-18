import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    String str=s.next();
	char[] c=str.toCharArray();
    if(Character.isUpperCase(c[0])) System.out.println("A");
    else System.out.println("a");

  }  
}