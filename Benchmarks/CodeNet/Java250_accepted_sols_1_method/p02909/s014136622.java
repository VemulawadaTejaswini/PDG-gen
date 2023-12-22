import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner in=new Scanner(System.in);
      	String S=in.next();
      	String res;
      	if(S.equals("Sunny")){
        	res="Cloudy";
        }
        else if(S.equals("Cloudy")){
        	res="Rainy";
        }
        else{
        	res="Sunny";
        }
      	System.out.println(res);
        in.close();
    }      
}