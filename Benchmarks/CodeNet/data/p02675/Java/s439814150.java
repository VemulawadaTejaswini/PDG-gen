import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String hun = n.substring(0);
    String ten = n.substring(1);
    String one = n.substring(2);
    int num = 0;
    String result = "";
    if(one == null){
      if(ten == null){
        num = Integer.parseInt(hun);
        if(num == 3){
          result = "bon";
        }else if(num == 0 && num == 1 && num == 6 && num == 8){
          result = "pon";
        }else{
          result = "hon";
        }
      }else{
        num = Integer.parseInt(ten);
        if(num == 3){
          result = "bon";
        }else if(num == 0 && num == 1 && num == 6 && num == 8){
          result = "pon";
        }else{
          result = "hon";
        }
      }
      }else{
        num = Integer.parseInt(one);
        if(num == 3){
          result = "bon";
        }else if(num == 0 && num == 1 && num == 6 && num == 8){
          result = "pon";
        }else{
          result = "hon";
        }
    }
    if(n.length() > 3){
      result = "";
    }
      System.out.println(result);
    }
    
  }