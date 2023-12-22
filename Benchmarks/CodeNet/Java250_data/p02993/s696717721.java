import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();        
        String t = "Good";
        for(int i=0;i<3;i++){if(s.charAt(i)==s.charAt(i+1)){t="Bad";break;
                                                 }
                            }        
		System.out.println(t);
	}
}
