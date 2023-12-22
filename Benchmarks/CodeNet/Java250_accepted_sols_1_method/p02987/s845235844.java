import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);
		
		String s = sc.next();
		boolean flag = false;
		
		if (s.charAt(0)==s.charAt(1)){
		    if (s.charAt(2)==s.charAt(3)){
		        if (s.charAt(0)==s.charAt(2)){
		        } else {
		        flag = true;
		        }
		    }
		} else if (s.charAt(0)==s.charAt(2)){
		    if (s.charAt(1)==s.charAt(3)){
		        if (s.charAt(0)==s.charAt(1)){
		        } else {
		        flag = true;
		        }
		    }
		} else if (s.charAt(0)==s.charAt(3)){
		    if (s.charAt(1)==s.charAt(2)){
		        if (s.charAt(0)==s.charAt(1)){
		        } else {
		        flag = true;
		        }
		    }
		}
		
		
		if (flag){
		    System.out.println("Yes");
		} else {
		    System.out.println("No");
		}
		

		sc.close();
	}
}
