import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String name = "";
      for(int i = 0;i<3;i++){
        String a = sc.next();
        name = name + a.substring(0,1);
      }
      System.out.println(name);
     	
    }
}