import java.util.Scanner;
import java.lang.*;

public class Main{
 
	public static void main(String args[]){
      
    	入力するためのオブジェクトを生成
      	Scanner scan = new Scanner(System.in);
      	String str = scan.next();
      
      	String name = str;
          System.out.printLn(name.substring(0,3));    
    }
}	