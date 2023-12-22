import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char a=s.charAt(0);
		char b= s.charAt(1);
		char c= s.charAt(2);
		if(a=='7'||b=='7'||c=='7'){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}