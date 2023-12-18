import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S.length() == 3) {
			if(S.equals("RRR")) {
				System.out.println("3");
			}else if(S.equals("RRS") || S.equals("SRR")) {
				System.out.println("2");
			}else if(S.equals("RSR") || S.equals("SRS") || S.equals("SSR") || S.equals("RSS")) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}
	}
}