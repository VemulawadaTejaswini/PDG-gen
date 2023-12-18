import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] num = new Integer[n];
		StringBuilder s = new StringBuilder("");
		for(int i=0;i<n;i++){
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		
		s.append(num[0]);
		for(int i=1;i<num.length;i++){
			s.append(" "+num[i]);
		}
		
		System.out.println(s);
	}
}