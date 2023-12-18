import java.util.*;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      ArrayList<Integer> list = new ArrayList<Integer>();
      int a =sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int number = 3;
      if(a == b){
      	number--;
      }
      if(a == c){
      	number --;
      }
      if(b == c){
      	number --;
      }
      if(number ==0){
      	number=1;
      }
      System.out.println(number);
    }
}
