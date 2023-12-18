import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ret = 0;
		if(S.equals("RRR")){
			ret = 3;
		}else if(S.contains("RR")){
			ret = 2;
		}else if(S.contains("R")){
			ret = 1;
		}
		System.out.println(ret);
	}
}
