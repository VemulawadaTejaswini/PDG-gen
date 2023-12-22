import java.util.*;
public class Main{
public static void main (String [] args){	
Scanner scanner = new Scanner (System.in); 
    String a = scanner.next();
    String b = "";
    if (a.charAt(0) == 48){
      for (int i = 0; i < a.length()/2 + 1; i++){
        b = b + "01";
      }
    }
    else{
      for (int i = 0; i < a.length()/2+1; i++){
        b = b + "10";
      }
    }
    int counter = 0;
    for (int i = 0; i < a.length(); i++){
      if (a.charAt(i) != b.charAt(i))
        counter++;
    }
    System.out.println(counter);
}
}