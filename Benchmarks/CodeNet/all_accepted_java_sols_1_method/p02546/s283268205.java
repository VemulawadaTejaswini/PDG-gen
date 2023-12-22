import java.util.*;

public class Main{
	public static void main(String args[]){
	
		Scanner ob = new Scanner(System.in);
		String str = ob.next();
		
		if(str.charAt(str.length() - 1) == 's'){
			str += "es";
		}else{
			str += 's';
		}

		System.out.println(str);
	}
}
