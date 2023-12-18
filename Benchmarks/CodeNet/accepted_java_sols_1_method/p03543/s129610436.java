import java.util.*;

public class Main{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String fir = s.substring(0, 1);
	String sec = s.substring(1, 2);
	String thi = s.substring(2, 3);
	String fou = s.substring(3, 4);
	String ans;
	if(fir.equals(sec) & fir.equals(thi)) {
		ans = "Yes";
	}else if(sec.equals(thi) & sec.equals(fou)) {
		ans = "Yes";
	}else {
		ans = "No";
	}
	System.out.print(ans);
	
	}
}