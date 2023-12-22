import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner cs = new Scanner(System.in);
	String s = cs.nextLine();
    int a,b;

    a = Integer.parseInt(s.substring(0,2));
    b = Integer.parseInt(s.substring(2,4));
    String ans;
    if(0<a&&a<13&&(b==0||b>12)){
      ans = "MMYY";
    }else if((0<b&&b<13&&(a==0||a>12))){
      ans = "YYMM";
    }else if(0<a&&a<13&&0<b&&b<13){
      ans = "AMBIGUOUS";
    }else{
      ans = "NA";
    }
    System.out.println(ans);

    
  }
}