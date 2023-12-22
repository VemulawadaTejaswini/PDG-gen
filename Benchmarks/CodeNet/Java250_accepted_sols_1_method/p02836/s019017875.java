import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		int x = 0;

		for(int i=0;i < s.length()/2 ;i++){
			if(!(s.charAt(i) == s.charAt(s.length()-i-1)))
				x+=1;
		}
		System.out.println(x);

	}
}