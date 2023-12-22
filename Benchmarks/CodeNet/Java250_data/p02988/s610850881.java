import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] p = new int[n];
		for(int i=0; i<n; i++) {
			p[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0;i<n-2;i++) {
			if(judge(p,i)) count++;
		}
		System.out.println(count);
		
		sc.close();	
	}
	
	private static boolean judge(int[] p,int first) {
		int i1 = p[first];
		int i2 = p[first + 1];
		int i3 = p[first + 2];
		
		if(i1 < i2 && i2 < i3 || i1 > i2 && i2 > i3) {
			return true;
		}else {
			return false;
		}
	}
}