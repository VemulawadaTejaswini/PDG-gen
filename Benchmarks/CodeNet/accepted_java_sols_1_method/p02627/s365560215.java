import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	String s = sc.next();
        if( (int)s.charAt(0)-48 >= 0 && (int)s.charAt(0)-48 <=48 ){
          System.out.println('A');
        }else{
          System.out.println('a');
        }      
	}
}