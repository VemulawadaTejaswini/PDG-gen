import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		
		char[] arr = S.toCharArray();
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] += N;
			if (arr[i] > 90) arr[i] -= 26;
		}
		
		System.out.println(arr);
		
	}
}
