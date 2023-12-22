import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nmList = sc.nextLine().split(" ");
		StringBuilder sb = new StringBuilder();
		sb.append(nmList[0]);
		sb.append(nmList[1]);
		Integer nm = Integer.parseInt(sb.toString());
		double k = Math.sqrt(nm);
		int k2 = (int)k;
		if(k2*k2 == nm) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
