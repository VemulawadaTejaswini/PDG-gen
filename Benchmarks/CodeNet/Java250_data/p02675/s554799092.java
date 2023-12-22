import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    int len = n.length()-1;
    String ans;
    if(n.charAt(len)=='2'||n.charAt(len)=='4'||n.charAt(len)=='5'||n.charAt(len)=='7'||n.charAt(len)=='9'){
      ans = "hon";
    }else if(n.charAt(len)=='0'||n.charAt(len)=='1'||n.charAt(len)=='6'||n.charAt(len)=='8'){
      ans = "pon";
    }else{
      ans = "bon";
    }
    
    System.out.println(ans);
    
  }
}
