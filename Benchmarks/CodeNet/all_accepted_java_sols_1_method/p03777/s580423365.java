import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		if(str1.equals("H")){
			if(str2.equals("H")){
				System.out.println("H");
			}else{
				System.out.println("D");
			}
		}else{
			if(str2.equals("H")){
				System.out.println("D");
			}else{
				System.out.println("H");
			}
		}
	}
}
