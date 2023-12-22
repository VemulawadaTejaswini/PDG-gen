import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean judge = true;
    boolean cex = true;
    
    for(int i = 0; i < s.length() && judge;i++){
      if(i == 0){
      	if(!(s.charAt(i) == 'A')) judge = false;
      }
      else if(i > 1 && i < s.length()-1 && cex){
        if(s.charAt(i) == 'C') cex = false;
        else if((int)s.charAt(i) < 96 || 122 < (int)s.charAt(i)) judge = false; 
      }
      else{
        if((int)s.charAt(i) < 96 || 122 < (int)s.charAt(i)) judge = false;
      }
    }
  	
    if(!cex && judge) System.out.println("AC");
    else System.out.println("WA");
  }
}
