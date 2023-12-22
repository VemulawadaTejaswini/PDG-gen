//package impQuestions;


import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str,ans;
		str = sc.next();
		if(str.endsWith("s")) ans = str+"es";
		else ans = str+"s";
		System.out.println(ans);
	}

}
