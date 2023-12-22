import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      String str = sc.next();
      char[] array = str.toCharArray();
      int count = 0;
      for(int i = 0;i < array.length;i++){
      	if(array[i] == '1'){
        	count++;
        }
      }
      System.out.println(count);
    }
}
