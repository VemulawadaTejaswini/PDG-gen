import java.util.*;

public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int ret = 0;
	  for(int i=0; i<3; i++){
        if(s.charAt(i) == '1') ret++;
      }
    System.out.println(ret);
  }
}