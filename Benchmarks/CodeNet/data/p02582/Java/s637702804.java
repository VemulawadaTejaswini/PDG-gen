import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];
		for(int i = 0;i < 3;i++) {
			String S = sc.next();
			str[i] += S;
		}
		if(str[0] == "R" && str[1] == "R") {
			System.out.println("2");
		}else if(str[1] == "R" && str[2] == "R") {
			System.out.println("2");
		}else {
			System.out.println("2");
		}
	}
}