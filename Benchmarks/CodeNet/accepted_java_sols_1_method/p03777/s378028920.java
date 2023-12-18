import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	String a = scn.next();
      String b = scn.next();
      String h = "H";
      String d = "D";
      int check = 0;
      if(a.equals(h)){
       if(b.equals(d)){
         check=1;
       }
      }
      if(a.equals(d)){
       if(b.equals(h)){
         check=1;
       }
      }
      if(check==1){
        System.out.println("D");
      }else{
        System.out.println("H");
      }
	}
}
