import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String l = sc.nextLine();
		Integer N = Integer.valueOf(l);
		l = sc.nextLine();
		String[] arr = l.split(" ");
		
		StringBuilder sb = new StringBuilder();
		int[] boss = new int[arr.length + 1];
		int[] result = new int[N+1];
		
		int count = 1;
		for(String s : arr) {
			result[Integer.valueOf(s)]++;
			
		}
		for (int i = 1; i < result.length; i++) {
			sb.append(result[i]+"\n");
		}
		sc.close();
		System.out.println(sb.toString());
	}
}