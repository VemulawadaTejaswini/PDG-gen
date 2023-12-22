import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	String n = sc.next();
      	String newn ="";
      	for(int i = 0; i < 3; i++){
	      	if(n.charAt(i) == '1'){
            	newn += "9";
            }else if(n.charAt(i) == '9'){
            	newn += "1";
            }else{
            	newn += String.valueOf(n.charAt(i));
            }
        }
      	System.out.println(newn);
    }
}