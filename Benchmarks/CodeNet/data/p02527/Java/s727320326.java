import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Integer[] num = new Integer[n];
		String str = "";
		for(int i=0;i<n;i++){
			num[i] = scan.nextInt();
		}
		Arrays.sort(num);
		
		
		for(int i:num){
			str += i+" ";
		}
		
		System.out.println(str.substring(0,str.length()-1));
	}
}