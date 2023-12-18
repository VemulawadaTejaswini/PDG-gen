import java.util.Scanner;

class Main {
	public static void main(String args[]){
		int[] n = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n.length;i++){
			n[i] = sc.nextInt();
		}
		System.out.println(n[0]-(int)Math.max(Math.ceil((double)n[1]/n[3]),Math.ceil((double)n[2]/n[4])));
	}
}