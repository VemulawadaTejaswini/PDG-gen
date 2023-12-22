import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      for(char s='a'; s<='z'; s++){
        if(!(str.contains(s+""))){
          System.out.println(s);
          return;
        }
      }
      System.out.println("None");
    }
}