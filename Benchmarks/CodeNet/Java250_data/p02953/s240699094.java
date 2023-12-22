import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		boolean pd = true;
		for (int i = 0; i < p.length; i++){
			p[i] = sc.nextInt();
		}
		if (n==1) {
		} else if (p[0]>p[1]) {
			p[0] --;
			if (p[0]>p[1]) {
				pd = false;
			}
		}
		for (int i = 1; i < p.length-1; i++){
			if (p[i]>p[i+1]) {
				p[i]--;
				if (p[i]>p[i+1]||p[i]<p[i-1]){
					pd = false;
					break;
				}
			} else {
				if(p[i]>p[i-1])
					p[i]--;
			}
		}
		if (pd) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}