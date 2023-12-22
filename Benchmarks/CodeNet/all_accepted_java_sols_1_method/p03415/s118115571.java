import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int i = 1;
		String str = "";
		while (sc.hasNextLine()) {
		    String s = sc.nextLine();
		    String[] sr = s.split("");
		    str = str + sr[i];
		    i++;
		}

		// 出力
		System.out.println(str);
	}
}