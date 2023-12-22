import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		String p = sc.next();
		s = s.append(s);
		if(s.toString().contains(p)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}


