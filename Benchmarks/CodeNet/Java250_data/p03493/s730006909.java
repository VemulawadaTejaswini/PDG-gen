import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String str = sc.next();
      	int count = 0;
      	for(int i=0;i<str.length();i++){
        	char character = str.charAt(i);
          	if(character == '1'){
            	count++;
            }
        }
      System.out.print(count);
    }
}