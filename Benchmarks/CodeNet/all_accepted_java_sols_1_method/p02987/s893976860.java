import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
        String t = "No";
        if(s.charAt(0)==s.charAt(1))
        {if(s.charAt(2)==s.charAt(3) && s.charAt(0)!=s.charAt(2)){t = "Yes";}}
		 if(s.charAt(0)==s.charAt(2))
        {if(s.charAt(1)==s.charAt(3) && s.charAt(0)!=s.charAt(1)){t = "Yes";}}
         if(s.charAt(0)==s.charAt(3))
        {if(s.charAt(1)==s.charAt(2) && s.charAt(0)!=s.charAt(1)){t = "Yes";}}  
            System.out.println(t);
	}
}
