import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.length()==2){
			System.out.println(s);
		}
		else{
			for(int i=2; i>=0; i--){
				System.out.print(s.charAt(i));
			}
			System.out.println("");
		}
	}
}