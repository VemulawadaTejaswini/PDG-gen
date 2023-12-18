import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    String s=scn.next();
    if(Character.isUpperCase(s.charAt(0))) {
  	  	System.out.println("A");
	}else {
    	System.out.println("a");
	}
  }
}