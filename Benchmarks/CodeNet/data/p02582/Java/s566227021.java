import java.util.*;

public class Main{
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		if(S.equals("RRS") || S.equals("SRR")) {
			System.out.println("2");
		}else if(S.equals("RSR")) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}