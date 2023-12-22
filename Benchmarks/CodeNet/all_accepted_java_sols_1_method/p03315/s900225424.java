import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
      if(s.equals("++++")){
       System.out.println(4);
      }
      else if(s.equals("+++-") || s.equals("++-+") || s.equals("+-++")|| s.equals("-+++")){
      System.out.println(2);
      }
      else if(s.equals("+---") || s.equals("-+--") || s.equals("--+-")|| s.equals("---+")){
      System.out.println(-2);
      }
      else if(s.equals("----")){
       System.out.println(-4);
      }
      else{
      System.out.println(0);
      }
      
    }
}