import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] input = sc.nextLine().split(" ");
		String[] num = new String[n];
		for(int i=0;i<input.length;i++){
			num[i]=input[n-i-1];
		}
		for(int i=0;i<n-1;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println(num[n-1]);
	}
}