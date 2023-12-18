import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String[] strarray = a.split("");

		if (strarray[0].equals(strarray[1])&&strarray[1].equals(strarray[2])) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		
		
      	sc.close();
    }
		
		
}
