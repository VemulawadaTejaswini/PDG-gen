import java.util.*;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String list = "aiueo";
      if(list.indexOf(str)>=0){
        System.out.println("vowel");
      }else{
        System.out.println("consonant");
      }  
	}
}
