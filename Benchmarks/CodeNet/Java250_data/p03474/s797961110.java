import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		String s = sc.next();
		
		String s_1 = s.substring(0, a);
		String s_2 = s.substring(a + 1);
		
		boolean b_1 = false;
		boolean b_2 = false;
		
		for(int i = 0; i < s_1.length(); ++i) {
		    if(Character.isDigit(s_1.charAt(i))) b_1 = true;
		    else {
		        b_1 = false;
		        break;
		    }
		}
		
		for(int i = 0; i < s_2.length(); ++i) {
		    if(Character.isDigit(s_2.charAt(i))) b_2 = true;
		    else {
		        b_1 = false;
		        break;
		    }
		}
		
		String ans = s_1 + '-' + s_2;
		
        //System.out.println(s_1);
        //System.out.println(b_1);
        //System.out.println(s_2);
        //System.out.println(b_2);
        //System.out.println(s==ans);
      
		if(s.equals(ans) && b_1 && b_2) System.out.println("Yes");
		else System.out.println("No");
	    
	}
}