import java.util.*;
class Main {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
  	char c = scan.next().charAt(0);
    if(c >= 'A' && c <= 'Z'){
    	System.out.println("A");   
    }else if (c >= 'a' && c <= 'z'){
    	System.out.println("a");
    }
  }
}