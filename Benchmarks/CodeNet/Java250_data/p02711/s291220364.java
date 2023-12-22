import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    if(a.charAt(0)=='7'||a.charAt(1)=='7'||a.charAt(2)=='7'){
    	pl("Yes");
    }else{
    	pl("No");
    }
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
