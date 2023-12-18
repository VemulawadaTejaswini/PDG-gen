import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int sz = Integer.parseInt(sc.nextLine());
        String l2 = sc.nextLine().trim();
		String s1 = l2.split("\\s+")[0];
		String s2 = l2.split("\\s+")[1];
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<sz; i++) {
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(i));
		}

        System.out.println(sb.toString());
	}
}
