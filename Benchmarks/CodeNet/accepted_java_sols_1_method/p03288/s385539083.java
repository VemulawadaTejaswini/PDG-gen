import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		String ans = "AGC";
      	if(r<1200) ans = "ABC";
      	if(r>=1200 && r<2800) ans = "ARC";
      	System.out.println(ans);
	}
}