import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
        String str = sc.next(); 
        String s = "Yes";
        for(int i=0;i<str.length();i++){
          if((i%2==0 && str.charAt(i)== 'L') || (i%2==1 && str.charAt(i)=='R')){s = "No";break;}
                            }		    
		System.out.println(s);
	}
}
