import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      if(a.equals("A")){
        a = "T";
      }else if(a.equals("T")){
        a = "A";
      }else if(a.equals("G")){
        a = "C";
      }else{
        a = "G";
      }
      System.out.println(a);
    }
}