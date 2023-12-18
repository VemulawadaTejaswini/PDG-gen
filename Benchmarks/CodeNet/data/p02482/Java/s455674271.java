
import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner n = new Scanner(System.in);
	String s = new String();
	int a = n.nextInt();
	int b = n.nextInt();
	if(a>b){
		s = ">";
	}
	else if(a<b){
		s = "<";
	}
	else if(a==b){
		s = "==";
	}
	System.out.println("a" + " " + s + " " + "b");
	
	}

}