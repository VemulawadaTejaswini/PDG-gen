import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String data=sc.next();
	String last=data.subString(data.length-1,data.length);
    if(last=="s"){
	  System.out.println(last+"es");
    }else{
      System.out.println(last+"s");
    }
  }
}