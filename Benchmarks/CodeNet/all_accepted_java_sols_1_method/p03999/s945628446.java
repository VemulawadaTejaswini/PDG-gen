import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int N = s.length();
		if(N == 1){
			System.out.println(s);
			System.exit(0);
		}
		int limit = (int) Math.pow(2, N-1);
		
		long total = 0;
		
		for(int i = 0; i<limit; i++){
			StringBuilder binary = new StringBuilder();
			binary.append(Integer.toBinaryString(i));
			while(binary.length() < N-1) binary.insert(0, '0');
			binary.append('1');
			
			long sum = 0;
			int left = 0;
			for(int j = 0; j < N; j++){
				if(binary.charAt(j) == '1'){
					sum += Long.parseLong(s.substring(left, j + 1));
					left = j+1;
				}
			}
			total += sum;
		}
		System.out.println(total);
	}
}